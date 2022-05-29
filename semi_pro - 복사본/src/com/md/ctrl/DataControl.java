package com.md.ctrl;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.conn.db.Connect;
import com.md.MDAccount_t;
import com.md.MDControl_t;

public class DataControl {
	private Connect con;
	
	public DataControl() {
		try {
			con = new Connect(new File(System.getProperty("user.home") + "/oracle_db.conf"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean register(MDAccount_t data) {
		String query = "INSERT INTO MD_ACCOUNT VALUES(?, ?, ?, ?, SYSDATE)";
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
	
	public boolean update(MDAccount_t data) {
		String query = "UPDATE accounts"
				+ "        SET ID = ?"
				+ "          , PASSWORD = ?"
				+ "          , Name = ?"
				+ "      WHERE EMPLOYEE_ID = ?";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, data.getID());
			pstat.setString(2, data.getPASSWORD());
			pstat.setString(3, data.getName());
			pstat.setString(4, data.getEMPLOYEE_ID());
			
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
	
	public boolean remove(MDAccount_t data) {
		String query = "DELETE FROM accounts WHERE ID = ?";
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
	
	public MDAccount_t get(String ID) {
		String query = "SELECT * FROM MD_ACCOUNT WHERE ID = ?";
		try {
			PreparedStatement pstat = con.getPstat(query);
			pstat.setString(1, ID);
			
			ResultSet rs = con.sendSelectQuery();
			if(rs.next()) {
				MDAccount_t data = new MDAccount_t();
				data.setID(rs.getString("ID"));
				data.setPASSWORD(rs.getString("PASSWORD"));
				data.setName(rs.getString("Name"));
				data.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
				data.setCreateDate(rs.getDate("createdate"));
				return data;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
//	public boolean view(MDControl_t data) {
//		String query = "SELECT "
//				+ "        	   Product_no AS '제품번호' = ?"
//				+ "          , Brand_name AS '브랜드명' = ?"
//				+ "          , Style_no AS '스타일넘버' = ?"
//				+ "          , Product_name AS '제품명' = ?"
//				+ "          , Price AS '정상가' = ?"
//				+ "          , Sale_price AS '판매가' = ?"
//				+ "          , Cost_price AS '원가' = ?"
//				+ "          , Sale_per AS '할인율' = ?"
//				+ "          , Margin_per AS '마진율' = ?"
//				+ "          , Margin_won AS '마진액' = ?"
//				+ "          , Stock AS '재고수' = ?"
//				+ "          , ManagerID AS '관리자' = ?"
//				+ "          , Regi_date AS '등록일' = ?"
//				+ "          , Edit_date AS '수정일' = ?"
//				+ "		  FROM MDControl_t";
//		try {
//			PreparedStatement pstat = con.getPstat(query);
//			pstat.setInt(1, data.getProduct_no());
//			pstat.setString(2, data.getBrand_name());
//			pstat.setString(3, data.getStyle_no());
//			pstat.setInt(4, data.getProduct_no());
//			pstat.setString(5, data.getProduct_name());
//			pstat.setInt(6, data.getPrice());
//			pstat.setInt(7, data.getSale_price());
//			pstat.setInt(8, data.getCost_price());
//			pstat.setString(9, data.getSale_per());
//			pstat.setString(10, data.getMargin_per());
//			pstat.setInt(11, data.getMargin_won());
//			pstat.setInt(12, data.getStock());
//			pstat.setString(13, data.getManagerID());
//			pstat.setDate(14, data.getRegi_date());
//			pstat.setDate(15, data.getEdit_date());
//
//			
//			ResultSet rs = con.sendSelectQuery();
//			if(rs.next()) {
//				MDControl_t data = new MDControl_t();
//				data.setID(rs.getString("ID"));
//				data.setPASSWORD(rs.getString("PASSWORD"));
//				data.setName(rs.getString("Name"));
//				data.setEMPLOYEE_ID(rs.getString("EMPLOYEE_ID"));
//				data.setCreateDate(rs.getDate("createdate"));
//				return data;
//			}
//			rs.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
}
