package com.conn.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBConn {

	public static SqlSession getSqlSession() {
		SqlSession sess = null;
		
		String config = "resources/mybatis-config.xml";
		try {
			InputStream is = Resources.getResourceAsStream(config);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is, "development");
			sess = ssf.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sess;
	}
	
	public static void main(String[] args) {
		SqlSession session = DBConn.getSqlSession();
		String result = session.selectOne("testMapper.test");
		System.out.println(result);
	}

}
