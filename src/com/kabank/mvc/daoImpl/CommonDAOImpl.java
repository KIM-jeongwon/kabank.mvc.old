package com.kabank.mvc.daoImpl;

import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.OracleEnum;
import com.kabank.mvc.enums.TnameEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;

import java.sql.*;
public class CommonDAOImpl implements CommonDAO{
		
	@Override
	public String selectTableCount() {
		String count = "";
		try {	
			ResultSet rs =
					DatabaseFactory.create(Vendor.ORACLE)
					.getConnection().createStatement().executeQuery(
					DMLEnum.COUNT.toString()+TnameEnum.MEMBER);
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

