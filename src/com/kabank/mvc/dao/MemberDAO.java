
package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.kabankBean.MemberBean;


public interface MemberDAO {
	public List<MemberBean> selectMembers();
	public void insertMember();
	public MemberBean selectMemberById(MemberBean member);
	public MemberBean login();
	public void updatePass(MemberBean member);
	public void removeId(MemberBean member);
}