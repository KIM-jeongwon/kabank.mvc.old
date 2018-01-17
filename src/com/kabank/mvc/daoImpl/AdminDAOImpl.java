package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.enums.OracleEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.kabankBean.MemberBean;
import java.sql.*;
import java.util.Random;
public class AdminDAOImpl implements AdminDAO{
	MemberBean m;

	@Override
	public void makeTable(String sql) {
		try {
		System.out.println("========:" + sql);
			DatabaseFactory.create(Vendor.ORACLE).getConnection().createStatement().executeUpdate(sql);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*	@Override
	public void memberTable() {*/
/*		try {
			Class.forName(DBMS.ORACLE_DRIVER);
			Connection conn = DriverManager.getConnection(
					DBMS.ORACLE_CONNECTION_URL,
					DBMS.ORACLE_USERNAME,
					DBMS.ORACLE_PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tab");
			List<String> list = new ArrayList<>();
			while(rs.next()) {
				String temp = rs.getString("TNAME");
				list.add(temp);
			}
			boolean exist = false;
			for(String s : list) {
				if(s.equalsIgnoreCase("member")) {
					exist = true;
						break;				
				}
			}
		  if(!exist){
			  stmt.executeUpdate(Adminsql.CREATE_MEMBER);
			  }

			  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/





