package data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import json.*;
public class DbOrderInfo {
	Connection conn = data.JDBCUtil.getConn();
	//查找用户的全部订单
	public JSONArray getAllOrder(String userId){
		String sql = " select b.order_id,b.order_time,s.space_address,order_state "
				+ " from book_order_info b,space_info s where b.space_id=s.space_id AND b.user_id='" +userId+ "'";
		JSONArray jsar = new JSONArray();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				JSONObject jsonObjs = new JSONObject();
				jsonObjs.put("order_id", rs.getString(1));
				jsonObjs.put("order_time", rs.getString(2));
				jsonObjs.put("space_id", rs.getString(3));
				jsar.put(jsonObjs);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jsar;
	}
	
	//查询某一订单的详细信息,返回jsonarray
	public JSONArray getOrderDetail(String order_id){
		
		
		
		return null;
	}
	
}
