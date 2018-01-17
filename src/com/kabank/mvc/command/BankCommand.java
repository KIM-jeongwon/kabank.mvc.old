package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.kabank.mvc.iterator.ParamsIterator;

public class BankCommand implements IOrder{
	Map<?,?> map;
	public BankCommand(HttpServletRequest request)  {
		map = ParamsIterator.execute(request);
}
	@Override
	public void execute() {
		String account = String.valueOf("account");
		String id = String.valueOf(map.get("id"));
		InitCommand.cmd.setData(account);
		InitCommand.cmd.setColumn("id");
		InitCommand.cmd.setData(id);
	}
}
