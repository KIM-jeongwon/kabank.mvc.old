package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.iterator.ParamsIterator;

public class ChangeCommand implements IOrder{
	Map<?,?> map;
	public ChangeCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
	}
	 @Override
	public void execute() {
		 System.out.println("===============맵"+map);
		 String newPass = String.valueOf(map.get("change_pass"))+"/"+String.valueOf(map.get("id"));
		 System.out.println("pass============"+newPass);
		 InitCommand.cmd.setData(newPass);
	}
}
