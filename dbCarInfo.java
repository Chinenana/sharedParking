package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbCarInfo {
	String ss="";
	Connection conn=JDBCUtil.getConn();
	//修改用户头像图片地址 修改成功返回1，失败返回0
	public String updateUserImage(String user_id,String user_image){
	
	try { 
		String sql="update user_info set user_image=? where user_id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, user_image);
		pst.setString(2, user_id);
		int i=pst.executeUpdate(); 
		if(i==1){
			ss="1";
		}else{
			ss="0";
		}
		pst.close();
	} catch (SQLException e){
		e.printStackTrace();
	}
	return ss;
}
	
	//我的钱包
	
	
	
	
	
	
	
	
	
	//个人信息
	
	
	
	
	
	
	
	
	//我的订单
	
	
	
	
	
	//我的收藏
	
	
	
	
	//我的评价
	
	
	
	
	//场地反馈
	
	
	
	
	
	//更多设置
	
	
}
