package com.kabank.mvc.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import com.kabank.mvc.service.BankService;

public class BankServiceImpl implements BankService{
	private Map<String,String> mapMenu;

	public BankServiceImpl() {
		mapMenu = new HashMap<String,String>();
		}
}
