package com.kabank.mvc.serviceImpl;


import com.kabank.mvc.constant.Adminsql;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService{
MemberBean m ;

	@Override
	public void makeTable(String tname) {
		AdminDAO dao = new AdminDAOImpl();
		String sql = "";
		switch (tname) {
		case "member":
			sql = Adminsql.CREATE_MEMBER;
			break;
		case "attend":
			sql = Adminsql.CREATE_ATTEND;
			break;
		default:
			break;
		}
		dao.makeTable(sql);
		
	}
}
