package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbCarInfo {
	String ss="";
	Connection conn=JDBCUtil.getConn();
	//�޸��û�ͷ��ͼƬ��ַ �޸ĳɹ�����1��ʧ�ܷ���0
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
	
	//�ҵ�Ǯ��
	
	
	
	
	
	
	
	
	
	//������Ϣ
	
	
	
	
	
	
	
	
	//�ҵĶ���
	
	
	
	
	
	//�ҵ��ղ�
	
	
	
	
	//�ҵ�����
	
	
	
	
	//���ط���
	
	
	
	
	
	//��������
	
	
}
