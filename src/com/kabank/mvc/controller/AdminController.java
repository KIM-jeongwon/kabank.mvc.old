package com.kabank.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kabank.mvc.constant.Path;
import com.kabank.mvc.service.AdminService;
import com.kabank.mvc.serviceImpl.AdminServiceImpl;


@WebServlet({"/admin/main.do" , "/admin/create_table.do"})
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		AdminService service = new AdminServiceImpl();
		String action = request.getServletPath();
		System.out.println("서블릿패스가 지나간길 :"+ action);
		String dest = request.getServletPath().split(Path.SEPARATOR)[2].split(Path.DOT)[0];
		String dir = request.getServletPath().split(Path.SEPARATOR)[1];
		System.out.println("실제 지나간 경로 : "+Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION);
		switch(dest) {
		case "main":
				dir = "admin";
				dest = "main";
				break;
		case "create_table" : 
				service.makeTable(request.getParameter("whatitis"));
				dir = "admin";
				dest = "main";
			break;
		default : 
				break;
		//dir = admin;
		// dest = main
		}
		request
		.getRequestDispatcher(Path.VIEW+dir+Path.SEPARATOR+dest+Path.EXTENSION)
		.forward(request, response);	
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
