package com.kabank.mvc.command;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.factory.ActionFactory;
import com.kabank.mvc.iterator.ParamsIterator;

public class InitCommand implements IOrder {
	public static Command cmd;
	Map<?,?> map;
	
	public InitCommand(HttpServletRequest request) {
		cmd = new Command();
		map = ParamsIterator.execute(request);
	}

	@Override
	public void execute() {
		String O = String.valueOf(map.get("cmd"));
		System.out.println("cmd : "+O);
		if(O.equals("null")) {
			System.out.println("IF 안의 cmd : null");
			cmd.setAction(ActionFactory.create("move"));
			System.out.println("action값은?"+cmd.getAction());
		}
		cmd.setAction(ActionFactory.create(O));
	}
}