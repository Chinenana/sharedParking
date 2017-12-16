package control;

import data.dbUserInfo;

public class Registered {
public String registered(String userid, String passwd){
		
	dbUserInfo db=new dbUserInfo();
	if(db.savaUserInfo(userid,passwd) == 1){ //保存信息成功
		return userid;
	}
	
	else{
		return "0";
	}
	
	}
}
