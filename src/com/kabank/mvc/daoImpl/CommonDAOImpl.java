package com.kabank.mvc.daoImpl;

import com.kabank.mvc.constant.CommonSQL;
import com.kabank.mvc.dao.CommonDAO;
import java.sql.*;
public class CommonDAOImpl implements CommonDAO{
		
	@Override
	public String selectTableCount() {
		String count = "";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bitcamp","bitcamp");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(CommonSQL.getWhere(" member")); 
			while(rs.next()){
				count = rs.getString("count");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return count;
	}
	//dao 에있는 7을 commoncontroller 로 보낸다.
}

