package com.kabank.mvc.daoImpl;

import com.kabank.mvc.constant.DBMS;
import com.kabank.mvc.constant.MemberSQL;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO{
		
	@Override
	public List<MemberBean> selectMembers() {
		String sql = "";
		List<MemberBean> list = new ArrayList<>();
		MemberBean m;
		try{
			Class.forName(DBMS.ORACLE_DRIVER);
		Connection conn =DriverManager.getConnection(
			     DBMS.ORACLE_CONNECTION_URL
				, DBMS.ORACLE_USERNAME 
				, DBMS.ORACLE_PASSWORD);
		Statement stmt = conn.createStatement();
		sql = MemberSQL.MEMBERS;
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			m = new MemberBean();
			m.setId(rs.getString("id"));
			m.setPass(rs.getString("pass"));
			list.add(m);
		}
		System.out.println(list);
		}catch(Exception e){
			
			e.printStackTrace();
		
		}
				return list;
	}
}
