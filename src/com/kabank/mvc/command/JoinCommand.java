package com.kabank.mvc.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.iterator.ParamsIterator;
import com.kabank.mvc.kabankBean.MemberBean;

public class JoinCommand implements IOrder{
	Map<?, ?> map;
	String a;
	HttpSession session;
	public JoinCommand(HttpServletRequest request) {
		map = ParamsIterator.execute(request);
		a = request.getServletPath();
		session = request.getSession();
	}

	@Override
	public void execute() {
		switch(a) {
		case "/kakao.do" :
			InitCommand.cmd.setData(((MemberBean) session.getAttribute("member")).getId());
			break;
		case "/member.do":
			String id = String.valueOf(map.get("id"));
			String pass = String.valueOf(map.get("pass"));
			String name = String.valueOf(map.get("name"));
			String ssn = String.valueOf(map.get("ssn"));
			String email = String.valueOf(map.get("email"));
			String addr = String.valueOf(map.get("addr"));
			String profile = String.valueOf(map.get("profile"));
			String phone = String.valueOf(map.get("phone1"))+String.valueOf(map.get("phone2"));
			InitCommand.cmd.setColumn("id/pass/name/ssn/email/addr/phone1/phone2");
			InitCommand.cmd.setData(id+"/"+pass+"/"+name+"/"+ssn+"/"+email+"/"+addr+"/"+phone+"/"+profile);
			System.out.println("넘어온 값들 : "+InitCommand.cmd.getData());
			break;
		}
		
	}
	
}
