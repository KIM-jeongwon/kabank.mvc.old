package com.kabank.mvc.kabankBean;


public class AccountBean {
private String accountNum,money,customerNum;


public String getCustomerNum() {
	return customerNum;
}

public void setCustomerNum(String customerNum) {
	this.customerNum = customerNum;
}

public String getAccountNum() {
	return accountNum;
}

public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
}

public String getMoney() {
	return money;
}

public void setMoney(String money) {
	this.money = money;
}
}
