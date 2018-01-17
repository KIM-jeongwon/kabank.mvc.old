package com.kabank.mvc.daoImpl;

import java.sql.SQLException;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.LoginCommand;
import com.kabank.mvc.dao.BankDAO;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.enums.DDLEnum;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.TnameEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.util.Enums;
import com.kabank.mvc.util.Enums.AccountColumn;

public class BankDAOImpl implements BankDAO{
	public static BankDAO getInstance() {return new BankDAOImpl();}
	private BankDAOImpl() {}
	@Override
	public void creat(String r) {
		System.out.println("뱅크 dao 임플------------------------------------------------------");
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.INSERT.toString()).insert(11, " "+TnameEnum.BANK+
					" ("+Enums.getAccountColumn()+")").
					append("("+Enums.getBlanks(Enums.AccountColumn.values().length)+")");
			System.out.println("이넘인가=="+Enums.getAccountColumn());
			System.out.println("sql===  : "+sql.toString());
			System.out.println("ac id : "+InitCommand.cmd.getData());
			DatabaseFactory.create(Vendor.ORACLE).getConnection().createStatement().executeUpdate(String.format(sql.toString()
					,r,"50000000","3","5"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
