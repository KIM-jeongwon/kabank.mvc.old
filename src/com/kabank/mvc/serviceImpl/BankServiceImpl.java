package com.kabank.mvc.serviceImpl;


import java.util.Random;

import com.kabank.mvc.daoImpl.BankDAOImpl;
import com.kabank.mvc.service.BankService;

public class BankServiceImpl implements BankService{
	public static BankService getInstance() {
		return new BankServiceImpl();
	}
	private BankServiceImpl() {}

	@Override
	public void create() {
		
		System.out.println("뱅크 서비ㅅ ㅡ임플=============================");
				String r = String.valueOf((int)(Math.random()*8999+1000)+"-"+(int)(Math.random()*8999+1000)+"-"+(int)(Math.random()*8999+1000));

		BankDAOImpl.getInstance().creat(r);
		
	}
}
