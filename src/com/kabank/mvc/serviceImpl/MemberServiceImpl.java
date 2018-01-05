package com.kabank.mvc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.kabank.mvc.controller.MemberController;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.MemberService;

public class MemberServiceImpl implements MemberService{
	MemberBean m = new MemberBean();
	
	@Override
	public boolean login(MemberBean m) {
		boolean foo = false;
		MemberDAO dao = new MemberDAOImpl();
		List<MemberBean> list = dao.selectMembers();
		for(int i =0; i<list.size();i++) {
			System.out.println("리스트 아이디"+list.get(i).getId());
			if(m.getId().equals(list.get(i).getId())
					&& m.getPass().equals(list.get(i).getPass())) {
				foo = true;
			}
		}
	//	dao.selectMembers();
		return foo;
	}
			}



