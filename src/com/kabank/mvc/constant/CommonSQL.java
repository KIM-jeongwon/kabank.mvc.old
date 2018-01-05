package com.kabank.mvc.constant;


public class CommonSQL{
	public static String getWhere(String tname) {
		return "SELECT COUNT (*) AS count FROM" + tname;
	}
}
