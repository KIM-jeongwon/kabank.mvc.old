package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.command.BankCommand;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.JoinCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.kabankBean.AccountBean;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.BankService;
import com.kabank.mvc.serviceImpl.BankServiceImpl;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.util.DispatcherServlet;


@WebServlet("/kakao.do")
public class BankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("=-==========뱅크컨트롤러 ==========");
		HttpSession session = request.getSession();
		InitCommand init = new InitCommand(request);
		init.execute();
		System.out.println("init ========"+InitCommand.cmd.getAction());
		switch(InitCommand.cmd.getAction()) {
		case MOVE:
			new MoveCommand(request).execute();
			DispatcherServlet.send(request, response);
			break;
		case OPEN_ACCOUNT:
			System.out.println("뱅크 컨트롤러 들어옴=======");
			new MoveCommand(request).execute();
		InitCommand.cmd.setData(((MemberBean)request.getSession().getAttribute("member")).getId());
			DispatcherServlet.send(request, response);
			BankServiceImpl.getInstance().create();
			  InitCommand.cmd.setDir("member");
		      InitCommand.cmd.setPage("mypage");
			break;
		default:
			break;
	
		}
	}

}
