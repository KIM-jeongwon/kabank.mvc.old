package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.constant.Path;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;

@WebServlet({"/member/login.do","/member/join.do","/member/auth.do"})
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String dir = request.getServletPath().split(Path.SEPARATOR)[1];
		String action = request.getServletPath().split(Path.SEPARATOR)[2].split(Path.DOT)[0];
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String dest = "";
		System.out.println("action 가 지나간길 :" + action);
		System.out.println("ID 가 지나간길 :" + id);
		System.out.println("PASS 가 지나간길 :" + pass);
		switch (action) {
		case "auth":
			System.out.println("auth :" + pass);
			MemberService service = new MemberServiceImpl();
			MemberBean m  = new MemberBean();
			m.setId(request.getParameter("id"));
			m.setPass(request.getParameter("pass"));
			boolean flag= service.login(m);
			System.out.println(Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION);
			System.out.println("플레이그 :" +flag);
			if(flag) {
				dir="bitcamp";
				dest="main";
			}else {
				dir="member";
				dest="login";
			}
			break;
		case "login": 
			dest = action;
			break;
		case "join" :
			dest = action;
			break;
		default:
			break;
		}
		request
		.getRequestDispatcher(Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION)
		.forward(request, response);
		// /WEB-INF/view/member/login.jsp
		// /WEB-INF/view/(VIEW)+member(dir)+/+join(dest)+.jsp(EXTENSION) =>
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
