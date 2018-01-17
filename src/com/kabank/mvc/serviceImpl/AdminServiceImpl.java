package com.kabank.mvc.serviceImpl;


import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.daoImpl.AdminDAOImpl;
import com.kabank.mvc.daoImpl.MemberDAOImpl;
import com.kabank.mvc.enums.DDLEnum;
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
			sql = DDLEnum.CREATE_TABLE_MEMBER.toString();
			break;
		case "attend":
			sql = DDLEnum.CREATE_TABLE_ATTEND.toString();
			break;
		case "bank":
			sql = DDLEnum.CREATE_TABLE_BANK.toString();
		default:
			break;
		}
		dao.makeTable(sql);
		
	}

}
