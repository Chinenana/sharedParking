package control;
import data.dbUserInfo;
public class Login {
	public String login(String userid, String passwd){
		
		dbUserInfo db=new dbUserInfo();
		String pw=db.selectUserPw(userid);//获取用户密码
        if(pw.equals(passwd)){ //若密码匹配且状态设置成功 返回true
         //若登录成功 设置状态为1 表示登录	
        	db.setUserState(userid, "1");
        return userid;
        }
        else{
        return "0";
        }
	}

}

