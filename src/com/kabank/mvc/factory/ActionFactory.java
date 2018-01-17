package com.kabank.mvc.factory;

import com.kabank.mvc.enums.Action;

public class ActionFactory {
	public static Action create(String x) {
		System.out.println("액션팩토리로 들어옴");
		Action action = null;
		System.out.println("xxxxxxxxxxxxx : "+ x);
		if(x==null) {x="move";}
		
		switch(x) {
		case "move" :
			action = Action.MOVE;
			break;
		case "login":
			action = 
			Action.LOGIN;
			break;
		case "change":
			action =
			Action.CHANGE_PASS;
			break;
		case "delete":
			action =
			Action.DELETE;
			System.out.println("액션팩토리----액션---딜리트--------==========");
			break;
		case "add":
			action = 
			Action.ADD;
			System.out.println("액션팩토리===조인==================");
			break;
		case "logout":
			action = 
			Action.LOGOUT;
			break;
		case "open_account":
			action = 
			Action.OPEN_ACCOUNT;
			break;
		default:
				action = Action.MOVE;
				break;
		}
			return action;
	}
}
