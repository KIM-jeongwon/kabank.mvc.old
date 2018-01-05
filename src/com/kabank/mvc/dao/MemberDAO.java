package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.kabankBean.MemberBean;

public interface MemberDAO {
	public List<MemberBean> selectMembers();
}
