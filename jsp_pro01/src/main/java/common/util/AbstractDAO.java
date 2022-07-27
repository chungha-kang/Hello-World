package common.util;

import org.apache.ibatis.session.SqlSession;

import conn.db.DBConn;

public abstract class AbstractDAO {
	protected SqlSession session;
	
	public AbstractDAO() {
		session = DBConn.getSqlSession();
	}
	
	public void commit() {
		session.commit();
	}
	
	public void rollback() {
		session.rollback();
	}
	
	public void close() {
		session.close();
	}
	
}
