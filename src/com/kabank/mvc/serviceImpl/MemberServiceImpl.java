package com.kabank.mvc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.MemberService;
import com.kabank.mvc.util.Enums;

public class MemberServiceImpl implements MemberService {

	// private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {
		return new MemberServiceImpl();
	}
	
	private MemberServiceImpl() {}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		return MemberDAOImpl.getInstance().selectMemberById(member);
	}
	
	@Override
	public void make() {
		System.out.println("=========== memberserviceImpl 들어옴 ============");
		MemberDAOImpl.getInstance().insertMember();
	}

	@Override
	public MemberBean login() {
		return MemberDAOImpl.getInstance().login();
	}

	@Override
	public void changePass(MemberBean member) {
		MemberDAOImpl.getInstance().updatePass(member);
	}

	@Override
	public void DeleteId(MemberBean member) {
		MemberDAOImpl.getInstance().removeId(member);
		
	}

	@Override
	public void CreateBank() {
		for(int i=0; i<10000; i++) {
			String random1 = (int)(Math.random()*10000)+1+"-"+(int)(Math.random()*10000)+1+"-"+(int)(Math.random()*10000)+1;
		}
		}
	}


	



