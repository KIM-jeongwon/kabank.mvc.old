package com.kabank.mvc.constant;

public class MemberSQL {
	public static final String MEMBERS ="SELECT name,pass,ssn,id," + 
													"phone,email,profile,addr FROM Member";

	public static String getMembers() {
		return MEMBERS;
	}
}
