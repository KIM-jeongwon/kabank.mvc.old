package com.kabank.mvc.service;

import com.kabank.mvc.kabankBean.MemberBean;

public interface MemberService {
	public MemberBean findMemberById(MemberBean member);
	public void make();
	public MemberBean login();
	public void changePass(MemberBean member);
	public void DeleteId(MemberBean member);
	public void CreateBank();
}