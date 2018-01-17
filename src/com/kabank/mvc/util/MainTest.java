package com.kabank.mvc.util;

import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;

public class MainTest {
public static void main(String[] args) {
	for (Enums.MemberColumn a : Enums.MemberColumn.values()) {
		System.out.println("컬럼명 : " +a);
		}
	for (Enums.AttendColumn b : Enums.AttendColumn.values()) {
		System.out.println("어텐드컬럼명 : " +b);
		}
	for (Enums.AdminColumn c : Enums.AdminColumn.values()) {
		System.out.println("어드민컬럼명 : " +c);
		}
	StringBuffer buff=new StringBuffer(DMLEnum.SELECT.toString());
	System.out.println("기본 버프 : "+buff);
	buff.insert(6, " "+MemberEnum.PROPERTIES.toString());
	System.out.println("추가된 버프 : "+buff);
	}
}
