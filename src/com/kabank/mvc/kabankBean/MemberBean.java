package com.kabank.mvc.kabankBean;

import lombok.Data;

@Data
public class MemberBean {
	private String name,pass,ssn,id,
							phone,email,profile,addr;


	@Override
	public String toString() {
		return "회원정보 [이름 :" + id + ", 비밀번호 : " + pass + ", 이름 : " + name + ", 주민번호(생년월일+첫번째 번호) : " 
										+ ssn + ", 전화번호 : " + phone
				+ ", 이메일 : " + email + ", 프로필사진 : " + profile + ", 주소 : " + addr + "]";
	}
	
}
