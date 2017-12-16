
package control;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import json.*;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

//import cn.jpush.api.utils.Base64;
import control.JsonTools;
import data.dbUserInfo;


public class SelectUserInfo {
	
	public String selectUserInfo(String user_id){
		Map<String, Object> map=new HashMap<String, Object>();
		dbUserInfo db=new dbUserInfo();
		List<Map<String, Object>> list=new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> list2=new ArrayList<Map<String, Object>>();
		list=db.selectUserInfo(user_id);
		for(int i = 0; i < list.size();i++){
			map = list.get(i);
			String toDir = "c:\\workspace\\images\\User_images\\"+user_id+"\\Í¼Æ¬.jpg"; 
			String imageBuffer="";
			try{  
				File file=new File(toDir);
				if(!file.exists()){ 
					imageBuffer="null"; 
				}else{
					FileInputStream fis = new FileInputStream(toDir);  
					ByteArrayOutputStream baos = new ByteArrayOutputStream();  
					byte[] buffer = new byte[1024];  
					int count = 0; 
					while((count = fis.read(buffer)) >= 0){  
						baos.write(buffer, 0, count);  
					}  
					imageBuffer=new String(Base64.encode(baos.toByteArray()));   //½øÐÐBase64±àÂë 
				fis.close();
				}
			}catch(Exception e){  
				e.printStackTrace();  
			}
			 map.put("imageBuffer", imageBuffer);
			 list2.add(map);
		}
		String ss=JsonTools.createJsonString("address", list2);
		return ss;
	}
}
