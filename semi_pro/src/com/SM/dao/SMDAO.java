package com.SM.dao;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.SM.vo.SMAVO;
import com.SM.vo.SMCVO;
import com.conn.db.DBConn;

// Stock Manager Data Access Object)
public class SMDAO {
	private DBConn con;
	
	public SMDAO() {
		try {
			con = new DBConn(new File(System.getProperty("user.home") + "/oracle_db2.conf"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//SMAVO(Stock Manager Account Value Object) Data Access
	public boolean register(SMAVO data) {
		String query = "INSERT INTO SM_ACCOUNT VALUES(?, ?, ?, ?, SYSDATE)";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, data.getID());
			pstat.setString(2, data.getPASSWORD());
			pstat.setString(3, data.getName());
			pstat.setInt(4, data.getEMPLOYEE_ID());
			
			int rs = con.sendInsertQuery();
			if(rs == 1) {
				con.commit();
				return true;
			}
			con.rollback();
			return false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean update(SMAVO data) {
		String query = "UPDATE SM_ACCOUNT"
				+ "        SET ID = ?"
				+ "          , PASSWORD = ?"
				+ "          , Name = ?"
				+ "      WHERE EMPLOYEE_ID = ?";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, data.getID());
			pstat.setString(2, data.getPASSWORD());
			pstat.setString(3, data.getName());
			pstat.setInt(4, data.getEMPLOYEE_ID());
			
			int rs = con.sendUpdateQuery();
			if(rs == 1) {
				con.commit();
				return true;
			}
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean remove(SMAVO data) {
		String query = "DELETE FROM SM_ACCOUNT WHERE ID = ?";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, data.getID());
			
			int rs = con.sendDeleteQuery();
			if(rs == 1) {
				con.commit();
				return true;
			}
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public SMAVO get(String ID) {
		String query = "SELECT * FROM SM_ACCOUNT WHERE ID = ?";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, ID);
			
			ResultSet rs = con.sendSelectQuery();
			if(rs.next()) {
				SMAVO SMAdata = new SMAVO();
				SMAdata.setID(rs.getString("ID"));
				SMAdata.setPASSWORD(rs.getString("PASSWORD"));
				SMAdata.setName(rs.getString("Name"));
				SMAdata.setEMPLOYEE_ID(rs.getInt("EMPLOYEE_ID"));
				SMAdata.setCreateDate(rs.getDate("createdate"));
				return SMAdata;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	//SMCVO(Stock Manager Control Value Object) Data Access
	public boolean view(SMCVO data) {
		String query = "SELECT * FROM SM_ACCOUNT";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setInt(1, data.getProduct_no());
			
			
			int rs = con.sendDeleteQuery();
			if(rs == 1) {
				con.commit();
				return true;
			}
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean regi(SMCVO data) {
		System.out.println("개발중...");
		return false;
	}
	
	public boolean modi(SMCVO data) {
		System.out.println("개발중...");
		return false;
		
	}

	public boolean Calculate(SMCVO data) {
		System.out.println("개발중...");
		return false;
	}
}
