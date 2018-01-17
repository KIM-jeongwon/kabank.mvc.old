package com.kabank.mvc.enums;

public enum PathEnum {
VIEW("/WEB-INF/view/"),
SEPARATOR("/"),
EXTENSION(".jsp"),
DOT("\\.");
	
	public final String value;
	private PathEnum(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	VIEW{
		@Override
		public String toString() {
			return "/WEB-INF/view/";
	}
		//
	},
	SEPARATOR{
		@Override
		public String toString() {
			return "/";
		}
	},
	EXTENSION{
		@Override
		public String toString() {
			return ".jsp";
		}
	},
	DOT{
		@Override
		public String toString() {
			return "\\.";
		}
	}*/
