package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.enums.PathEnum;
import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;


@WebServlet({"/admin/main.do" , "/admin/create_table.do", })
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		AdminService service = new AdminServiceImpl();
		String action = request.getServletPath();
		System.out.println("서블릿패스가 지나간길 :"+ action);
		String dest = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[2].split(PathEnum.DOT.getValue())[0];
		String dir = request.getServletPath().split(PathEnum.SEPARATOR.getValue())[1];
		switch(dest) {
		case "main":
				dir = "admin";
				dest = "main";
				break;
		case "create_table" : 
				service.makeTable(request.getParameter("table_name"));
				dir = "kakao";
				dest = "main";
			break;
		default : 
				break;
		//dir = admin;
		// dest = main
		}
		request
		.getRequestDispatcher(PathEnum.VIEW.getValue()+dir+PathEnum.SEPARATOR.getValue()+dest+PathEnum.EXTENSION.getValue())
		.forward(request, response);	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
