package com.kabank.mvc.enums;

public enum Action {
	MOVE,ADD,LOGIN,JOIN,SEARCH,CHANGE_PASS,DELETE,LOGOUT,OPEN_ACCOUNT,
	VIEW{
		@Override
		public String toString() {
			return "WEB-INF/view/";
		}
	},
	EXTENSION{
		@Override
		public String toString() {
			return ".jsp";
		}
	},
	SEPARATOR{
		@Override
		public String toString() {
			return "/";
		}
	}
}
