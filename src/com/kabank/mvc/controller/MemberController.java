package com.kabank.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kabank.mvc.command.ChangeCommand;
import com.kabank.mvc.command.DeleteCommand;
import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.JoinCommand;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.command.MoveCommand;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.serviceImpl.MemberServiceImpl;
import com.kabank.mvc.util.DispatcherServlet;


@WebServlet("/member.do")
public class MemberController extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    System.out.println("================ Member Controller 내부로 들어옴 =================");
    HttpSession session = request.getSession();
    InitCommand init = new InitCommand(request);
    init.execute();
    switch(InitCommand.cmd.getAction()) {
    case MOVE: 
      System.out.println("================ Member-C: MOVE IN ==================");
      move(request);
      System.out.println("DEST IS "+InitCommand.cmd.getView());
      System.out.println("================ Member-C: MOVE OUT ==================");
      DispatcherServlet.send(request, response);
      break;
    case LOGIN: 
      MemberBean member = new MemberBean();
      System.out.println("================ Member-C: LOGIN IN ==================");
      member = (MemberBean) session.getAttribute("member");
      session.setAttribute("member", member);
      login(request, session);
      DispatcherServlet.send(request, response);
      System.out.println("================ Member-C: LOGIN OUT ==================");
      break;
    case CHANGE_PASS:
      System.out.println("================ Member-C: CHANGE-pass IN ==================");
      member = new MemberBean();
      /*ChangeCommand command =new ChangeCommand(request);
      .execute();*/
      new ChangeCommand(request).execute();
      System.out.println("변경 할 비밀 번호 : "+InitCommand.cmd.getData());
     /* String id = ((MemberBean) session.getAttribute("member")).getId();*/
      MemberServiceImpl.getInstance().changePass(member);
      member = (MemberBean) session.getAttribute("member");
      member.setPass(InitCommand.cmd.getData().split("/")[0]);
      session.setAttribute("member", member);
      move(request);
      DispatcherServlet.send(request, response);
      break;
    case DELETE:
    	System.out.println("딜리트들어옴=======================");
    	member = new MemberBean();
    	new LoginCommand(request).execute();
    	member.setId(((MemberBean) session.getAttribute("member")).getId());
    /*	String nowId = ((MemberBean) session.getAttribute("member")).getId();
    	member.setId(nowId);*/
    	System.out.println(member.getId()+"=----ID");
    	MemberServiceImpl.getInstance().DeleteId(member);
    	session.setAttribute("member", member);
    	session.invalidate();
    	move(request);
    	DispatcherServlet.send(request, response);
    	System.out.println("딜리트나감================================");
    	break;
    case ADD:
    	System.out.println("jjjjjjjjjjjjjjjjooooooooooooooooiiiiiiiiiiiiiiiiiiiiiiinnnnnnnnnnnnnnnnnnnnnIN");
    	member = new MemberBean();
    	new JoinCommand(request).execute();
    	MemberServiceImpl.getInstance().make();
    	move(request);
    	DispatcherServlet.send(request, response);
    	/*member((MemberBean) session.getAttribute("member")).toString();*/
    	System.out.println("jjjjjjjjjjjjjjjjooooooooooooooooiiiiiiiiiiiiiiiiiiiiiiinnnnnnnnnnnnnnnnnnnnnOUT");
      break;
    case LOGOUT:
    	System.out.println("-----------------------로그아웃들어옴------------------");
    	session.invalidate();
    	move(request);
    	DispatcherServlet.send(request, response);
    	System.out.println("----------------로그아웃나감----------------------------");
    	break;
    default: 
      break;
    }

  }
  private void move(HttpServletRequest request) {
    new MoveCommand(request).execute();
  }

  private void login(HttpServletRequest request, HttpSession session) {
    new LoginCommand(request).execute();
    MemberBean member = MemberServiceImpl.getInstance().login();
    if(member == null) {
      InitCommand.cmd.setDir("member");
      InitCommand.cmd.setPage("login");
    } else {
    	System.out.println("ID : ---------------------------" +member.toString());
      session.setAttribute("member", member);
      InitCommand.cmd.setDir("bitcamp");
      InitCommand.cmd.setPage("main");
    }
    move(request);
  }
  
}