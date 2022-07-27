package board;

import org.apache.ibatis.session.SqlSession;

public class BoardDao {

	SqlSession session = null;
	
	public boolean updateBoard(Board b) {
		int result = session.update("boardMapper.updateBoard", b);
		if(result == 1) {
			return true;
		}
		session.rollback();
		return false;
	}
}
