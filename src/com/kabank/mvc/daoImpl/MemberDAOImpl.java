package com.kabank.mvc.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.dao.MemberDAO;
import com.kabank.mvc.enums.DMLEnum;
import com.kabank.mvc.enums.MemberEnum;
import com.kabank.mvc.enums.TnameEnum;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.factory.SqlFactory;
import com.kabank.mvc.kabankBean.MemberBean;
import com.kabank.mvc.util.Enums;

public class MemberDAOImpl implements MemberDAO {
	public static MemberDAO getInstance() {return new MemberDAOImpl();}
	private MemberDAOImpl() {}
	
	@Override
	public List<MemberBean> selectMembers() {
		List<MemberBean> result = new ArrayList<>();
		try {
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE).getConnection().
					createStatement().executeQuery(SqlFactory.create(6, " *", " "+TnameEnum.MEMBER));
			while(rs.next()) {
				MemberBean member = new MemberBean();
				String id = rs.getString(MemberEnum.ID.name());
				String pass = rs.getString(MemberEnum.PASS.name());
				member.setId(id);
				member.setPass(pass);
				result.add(member);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public void insertMember() {
		System.out.println("=========== memberDAOImpl insertMmeber 들어옴 ============");
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.INSERT.toString()).insert(11, " "+TnameEnum.MEMBER+
					" ("+Enums.getMemberColumn()+")").
					append("("+Enums.getBlanks(Enums.MemberColumn.values().length)+")");
			System.out.println(sql.toString());
			DatabaseFactory.create(Vendor.ORACLE).getConnection().createStatement().executeUpdate(
					String.format(sql.toString(),
							InitCommand.cmd.getData().split("/")[0],
							InitCommand.cmd.getData().split("/")[1],
							InitCommand.cmd.getData().split("/")[2],
							InitCommand.cmd.getData().split("/")[3],
							InitCommand.cmd.getData().split("/")[4],
							InitCommand.cmd.getData().split("/")[5],
							InitCommand.cmd.getData().split("/")[6],
							InitCommand.cmd.getData().split("/")[7]
							));
		} catch (Exception e) {e.printStackTrace();}
	}

	@Override
	public MemberBean selectMemberById(MemberBean member) {
		System.out.println("========== selectMemberById IN ============");
		System.out.println("========== ID: " + member.getId());
		System.out.println("========== PASS: " + member.getPass());
		MemberBean mem = null;
		try {
			StringBuffer sql = new StringBuffer(DMLEnum.SELECT_ID_PASS.toString());
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE).getConnection().
					createStatement().executeQuery(String.format(sql.toString(), member.getId(), member.getPass()));
			while(rs.next()) {
				mem = new MemberBean();
				mem.setId(rs.getString(MemberEnum.ID.name()));
				mem.setPass(rs.getString(MemberEnum.PASS.name()));
				mem.setName(rs.getString(MemberEnum.NAME.name()));
				mem.setSsn(rs.getString(MemberEnum.SSN.name()));
				mem.setPhone(rs.getString(MemberEnum.PHONE.name()));
				mem.setEmail(rs.getString(MemberEnum.EMAIL.name()));
				mem.setProfile(rs.getString(MemberEnum.PROFILE.name()));
				mem.setAddr(rs.getString(MemberEnum.ADDR.name()));
			}
			
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("========== SPEC: " + member.toString());
		System.out.println("========== selectMemberById OUT ============");
		return mem;
	}
	@Override
	public MemberBean login() {
		System.out.println("================ Member-D: LOGIN IN ==================");
		StringBuffer sql = new StringBuffer(MemberEnum.LOGIN.toString());
		System.out.println("cmd : "+ InitCommand.cmd.getData());
		String[] arr = InitCommand.cmd.getData().split("/");
		System.out.println("ID: "+arr[0]);
		System.out.println("PASS: "+arr[1]);
		sql.replace(sql.indexOf("$"), sql.indexOf("$")+1, arr[0]);
		sql.replace(sql.indexOf("@"), sql.indexOf("@")+1, arr[1]);
		System.out.println("::::SQL::::" + sql.toString());
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory.create(Vendor.ORACLE).getConnection().createStatement().executeQuery(sql.toString());
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString(MemberEnum.ID.toString()));
				member.setPass(rs.getString(MemberEnum.PASS.toString()));
				member.setName(rs.getString(MemberEnum.NAME.toString()));
				member.setSsn(rs.getString(MemberEnum.SSN.toString()));
				member.setPhone(rs.getString(MemberEnum.PHONE.toString()));
				member.setEmail(rs.getString(MemberEnum.EMAIL.toString()));
				member.setProfile(rs.getString(MemberEnum.PROFILE.toString()));
				member.setAddr(rs.getString(MemberEnum.ADDR.toString()));
				System.out.println("다 어디갔나요 : "+member.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("================ Member-D: LOGIN OUT ==================");
		return member;
	}
	@Override
	public void updatePass(MemberBean member) {
		
		StringBuffer sql = new StringBuffer(DMLEnum.UPDATE_PASS.toString());
		String[] arr = InitCommand.cmd.getData().split("/");
		sql.replace(sql.indexOf("@"), sql.indexOf("@")+1, arr[0]);
		sql.replace(sql.indexOf("$"), sql.indexOf("$")+1, arr[1]);
		System.out.println("쿼리  : "+sql.toString());
		try {
			 DatabaseFactory.create(Vendor.ORACLE).getConnection().
					createStatement().executeUpdate(sql.toString());
			 
			System.out.println("DAO 비밀번호 : "+member.getPass());
			} catch (Exception e) {e.printStackTrace();}
		}
	@Override
	public void removeId(MemberBean member) {
		System.out.println("리무브 iD==========================================");
		StringBuffer sql = new StringBuffer(DMLEnum.DELETE_ID.toString());
		

		System.out.println("======================sql : "+ sql.toString());
		System.out.println("===================아이디 : "+ member.getId());
		sql.replace(sql.indexOf("@"),sql.indexOf("@")+1, member.getId());
		try {
			DatabaseFactory.create(Vendor.ORACLE).getConnection().
					createStatement().executeUpdate(sql.toString());
		} catch (Exception e) {e.printStackTrace();}
		}

	}

