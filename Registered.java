package control;

import data.dbUserInfo;

public class Registered {
public String registered(String userid, String passwd){
		
	dbUserInfo db=new dbUserInfo();
	if(db.savaUserInfo(userid,passwd) == 1){ //������Ϣ�ɹ�
		return userid;
	}
	
	else{
		return "0";
	}
	
	}
}
