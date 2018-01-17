package com.kabank.mvc.enums;

public enum TnameEnum {
	MEMBER,ATTEND,BANK,
	TNAMES{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return MEMBER+","+ATTEND+","+BANK;
		}
	}
}
