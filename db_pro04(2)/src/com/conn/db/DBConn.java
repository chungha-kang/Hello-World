package com.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final static String BASE_URL = "jdbc:oracle:thin:@";
	
	private String url_address;
	private Connection conn;
	private Statement stat;
	
	public DBConn(String domain, String port, String serviceName, String username, String password) throws Exception {
		url_address = String.format("%s:%s/%s", domain, port, serviceName);
		this.initConnect(username, password);
	}
	
	public DBConn(String tnsAlias, String walletPath, String username, String password) throws Exception {
		url_address = String.format("%s?TNS_ADMIN=%s", tnsAlias, walletPath);
		this.initConnect(username, password);
	}
	
	public void initConnect(String username, String password) throws Exception {
		// 1. Driver 등록
		Class.forName(DRIVER_NAME);
		
		// 2. DBMS 연결
		conn = DriverManager.getConnection(BASE_URL + url_address, username, password);
		conn.setAutoCommit(false);	// 자동 커밋을 막아주는 용도
		
		// 3. Statement 생성
		stat = conn.createStatement();
	}
	
	public ResultSet sendSelectQuery(String sql) throws Exception{
		ResultSet rs = this.stat.executeQuery(sql);
		return rs;
	}
	
	public int sendUpdateQuery(String sql) throws Exception {
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public int sendInsertQuery(String sql) throws Exception{
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public int sendDeleteQuery(String sql) throws Exception{
		int rs = this.stat.executeUpdate(sql);
		return rs;
	}
	
	public void commit() throws Exception {
		this.conn.commit();
	}
	
	public void rollback() throws Exception {
		this.conn.rollback();
	}
	
	public void close() throws Exception {
		// 5. 연결 해제
		this.stat.close();
		this.conn.close();		
	}

	public static void main(String[] args) throws Exception {
		//Connect myCon = new Connect("localhost", "1521", "XEPDB1", "puser1", "puser1");
		DBConn myDB = new DBConn("db202204211241_medium", "C:\\Users\\Chung\\eclipse\\oracle\\Wallet_DB202204211241"
				, "managerAdmin", "StockManager1234");
		
		// DB에 접속해서 입력하고 수정하고 삭제하는 구문
		//int rowCount = myCon.sendInsertQuery("INSERT INTO MD_ACCOUNT VALUES('test2', 'test2', '강테스', 102, SYSDATE)");
		//int rowCount = myCon.sendUpdateQuery("UPDATE MD_ACCOUNT SET Name = 'Tester' WHERE EMPLOYEE_ID = 102");
		//int rowCount = myCon.sendDeleteQuery("DELETE FROM MD_ACCOUNT WHERE Name = 'Tester'");
		//System.out.println(rowCount + " 개 행이 반영되었습니다.");
		
		ResultSet rs = myDB.sendSelectQuery("SELECT * FROM MD_ACCOUNT");
		if(rs.next()) {
			System.out.print(rs.getString("ID") + "\t");
			System.out.print(rs.getString("PASSWORD") + "\t");
			System.out.print(rs.getString("Name") + "\t");
			System.out.print(rs.getString("EMPLOYEE_ID") + "\t");
			System.out.print(rs.getString("CreateDate") + "\n");
		}
		myDB.commit();	//myCon.rollback();
		
		rs.close();
		myDB.close();
	}
}







//	public void localConnect() throws Exception {
//		// 1. Driver 등록
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		
//		// 2. DBMS 연결
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/XEPDB1", "puser1", "puser1");
//		
//		// 3. Statement 생성
//		Statement stat = conn.createStatement();
//		
//		// 4. SQL 전송 후 결과 받기
//		ResultSet rs = stat.executeQuery("SELECT 'Local Hello' FROM DUAL");
//		if(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
//		
//		// 5. 연결 해제
//		rs.close();
//		stat.close();
//		conn.close();
//	}
//	
//	public void cloudConnect() throws Exception {
//		// 1. Driver 등록
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		
//		// 2. DBMS 연결
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@db202204211241_medium?TNS_ADMIN=C:\\Users\\Chung\\eclipse\\oracle\\Wallet_DB202204211241", "managerAdmin", "StockManager1234");
//		
//		// 3. Statement 생성
//		Statement stat = conn.createStatement();
//		
//		// 4. SQL 전송 후 결과 받기
//		ResultSet rs = stat.executeQuery("SELECT 'Cloud Hello' FROM DUAL");
//		if(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
//		
//		// 5. 연결 해제
//		rs.close();
//		stat.close();
//		conn.close();
//	}
//	
//	public static void main(String[] args) throws Exception {
//		Connect myCon = new Connect();
//		myCon.localConnect();
//		myCon.cloudConnect();
//	}
