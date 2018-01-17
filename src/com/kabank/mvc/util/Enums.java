package com.kabank.mvc.util;

public class Enums {
	public enum MemberColumn {
		ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR
	}
	public enum AdminColumn{
		ID,PASS,NAME,SSN,PHONE,EMAIL,PROFILE,ADDR
	}
	public enum AttendColumn {
		SEQ,WEEK,STATUS,ID
	}
	public enum Table{
		MEMBER,ATTEND,ADMIN
	}
	public enum DML{
		SELECT,INSERT,INTO,UPDATE,DELETE,FROM
	}
	public enum AccountColumn{
		ACCOUNTNUM,MONEY,ID,CUSTOMNUM;
	}
	public static String getSql() {
		String sql="";
		return sql;
		
	}
	 public static String getMemberColumn() {
		    String res = "";
		    MemberColumn[] member = Enums.MemberColumn.values();
		    for(int i=0; i<member.length; i++) {
		      if(i!=member.length-1) {
		        res += member[i]+", ";
		      } else {
		        res += member[i];
		      }
		    }
		    return res;
		  }
	 public static String getAccountColumn() {
		    String res = "";
		   AccountColumn[] member = Enums.AccountColumn.values();
		    for(int i=0; i<member.length; i++) {
		      if(i!=member.length-1) {
		        res += member[i]+", ";
		      } else {
		        res += member[i];
		      }
		    }
		    return res;
		  }
	 public static String getBlanks(int count) {
		    String blanks = "";
		    for(int i=0; i<count; i++) {
		      if(!(i==count-1)) {
		        blanks += "'%s', ";
		      } else {
		        blanks += "'%s'";
		      }
		      
		    }
		    return blanks;
		  }
	
	
}
