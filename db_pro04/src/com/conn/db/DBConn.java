package com.conn.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DBConn {
	
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final static String BASE_URL = "jdbc:oracle:thin:@";
	
	private String url_address;
	private Connection conn;
	private Statement stat;
	private PreparedStatement pstat;
	
	// C: 에 만들어 둔 'Oracle_db(local).conf' 파일 읽는 방법
	public DBConn(File config) {
		
	}
	
	public static void main(String[] args) {
		String homePath = System.getProperty("user.home");
		DBConn db = new DBConn(new File(homePath + "/oracle_db.conf"));
	}
	
	
	// C: 에 만들어 둔 'Oracle_db.conf' 파일 (cloud) 읽는 방법
	public DBConn(File config) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
//		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(config));
		while(br.ready()) {
//			sb.append((char)fr.read());
//			System.out.print((char)fr.read());
			String[] keyValue = br.readLine().split("=");
			map.put(keyValue[0].strip(),  keyValue[1].strip());
		}
//		for(String s: sb.toString().split("\r\n")) {
//			String[] keyValue = s.split("=");
//			map.put(keyValue[0].strip(),  keyValue[1].strip());
//		}
//		System.out.println(map);
			
		if(map.get("host") != null) {
			url_address = String.format("%s:%s/%s", map.get("host"), map.get("port"), map.get("service"));
		} else if(map.get("tns_alias") != null) {
			url_address = String.format("%s?TNS_ADMIN=%s", map.get("tns_alias"), map.get("wallet_path"));
		} else {
			System.out.println("DB 연결 파일 구성이 잘못되었습니다.");
		}
		this.initConnect(map.get("username"), map.get("password"));
	}		
	
	public static void main(String[] args) throws Exception {
		String homePath = System.getProperty("user.home");
		DBConn myDB = new DBConn(new File(homePath + "/oracle_db.conf"));
	}
	
	public DBConn(String domain, String port, String serviceName, String username, String password) throws Exception {
		url_address = String.format("%s:%s/%s", domain, port, serviceName);
		this.initConnect(username, password);
	}
	
	public DBConn(String tnsAlias, String walletPath, String username, String password) throws Exception {
		url_address = String.format("%s?TNS_ADMIN=%s", tnsAlias, walletPath);
		this.initConnect(username, password);
	}
	
	private void initConnect(String username, String password) throws Exception {
		// 1. Driver 등록
		Class.forName(DRIVER_NAME);
		
		// 2. DBMS 연결
		conn = DriverManager.getConnection(BASE_URL + url_address, username, password);
		conn.setAutoCommit(false);		// 자동 commit 을 막는 용도
		
		// 3. State 생성 -> PreparedStatment 로 변경함.
		//stat = conn.createStatement();
	}
	
	public PreparedStatement getPstat(String sql) throws Exception {
		pstat = conn.prepareStatement(sql);
		return pstat;
	}
	
	public ResultSet sendSelectQuery() throws Exception {
		ResultSet rs = this.pstat.executeQuery();
		return rs;
	}
	
	public int sendUpdateQuery() throws Exception {
		int rs = this.pstat.executeUpdate();
		return rs;
	}
	
	public int sendInsertQuery() throws Exception {
		int rs = this.pstat.executeUpdate();
		return rs;
	}
	
	public int sendDeleteQuery() throws Exception {
		int rs = this.pstat.executeUpdate();
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
		this.pstat.close();
		this.conn.close();
	}
	
	
	
/*
package com.conn.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	
	private final static String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final static String BASE_URL = "jdbc:oracle:thin:@";
	
	private String url_address;
	private Connection conn;
	private Statement stat;
	
	public Connect(String domain, String port, String serviceName, String username, String password) throws Exception {
		url_address = String.format("%s:%s/%s", domain, port, serviceName);
		this.initConnect(username, password);
	}
	
	public Connect(String tnsAlias, String walletPath, String username, String password) throws Exception {
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
		Connect myCon = new Connect("db202204211241_medium", "C:\\Users\\Chung\\eclipse\\oracle\\Wallet_DB202204211241"
				, "managerAdmin", "StockManager1234");
		
		// DB에 접속해서 입력하고 수정하고 삭제하는 구문
		//int rowCount = myCon.sendInsertQuery("INSERT INTO MD_ACCOUNT VALUES('test2', 'test2', '강테스', 102, SYSDATE)");
		//int rowCount = myCon.sendUpdateQuery("UPDATE MD_ACCOUNT SET Name = 'Tester' WHERE EMPLOYEE_ID = 102");
		//int rowCount = myCon.sendDeleteQuery("DELETE FROM MD_ACCOUNT WHERE Name = 'Tester'");
		//System.out.println(rowCount + " 개 행이 반영되었습니다.");
		
		ResultSet rs = myCon.sendSelectQuery("SELECT * FROM MD_ACCOUNT");
		if(rs.next()) {
			System.out.print(rs.getString("ID") + "\t");
			System.out.print(rs.getString("PASSWORD") + "\t");
			System.out.print(rs.getString("Name") + "\t");
			System.out.print(rs.getString("EMPLOYEE_ID") + "\t");
			System.out.print(rs.getString("CreateDate") + "\n");
		}
		myCon.commit();	//myCon.rollback();
		
		rs.close();
		myCon.close();
	}
}
 */

}



/*
public class DBConn {
	
	public void localConnect() throws Exception {		
		// 1. Driver 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. DBMS 연결
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "puser1", "puser1");
		
		// 3. Statement 생성
		Statement stat = conn.createStatement();
		
		// 4.SQL 전송 후 결과 받기
		ResultSet rs = stat.executeQuery("SELECT 'Hello' FROM DUAL");
		if(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		// 5. 연결 해제
		rs.close();
		stat.close();
		conn.close();
	}
		
	
	public void cloudConnect() throws Exception {
		// 1. Driver 등록
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2. DBMS 연결
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@db202204211241_medium?TNS_ADMIN=C:\\Users\\Chung\\eclipse\\oracle\\Wallet_DB202204211241", "puser1", "Database1234");
				
		// 3. Statement 생성
		Statement stat = conn.createStatement();	
				
		// 4.SQL 전송 후 결과 받기
		ResultSet rs = stat.executeQuery("SELECT 'Cloud Hello' FROM DUAL");
		if(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		// 5. 연결 해제
		rs.close();
		stat.close();
		conn.close();
	}

	public static void main(String[] args) throws Exception {
		DBConn myDB = new DBConn();
		myDB.localConnect();
		myDB.cloudConnect();
	
	}

}
*/