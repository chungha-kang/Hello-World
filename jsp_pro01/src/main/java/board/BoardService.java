package board;

import org.apache.ibatis.session.SqlSession;


public class BoardService {
	
	private BoardDao dao;
	
	public int updateBoard(String id) {
		dao = new BoardDao();
		
		if(dao.searchBId(Integer.parseInt(id)) == null) {
			dao.rollback();
			dao.close();
			return -1;	// 삭제 대상이 없음을 알림 (이미 삭제됨.)
		}
		
		boolean result = dao.updateBoard(Integer.parseInt(id));
		if(result) {
			dao.commit();
			dao.close();
			return 1;
		}
		dao.rollback();
		dao.close();
		return 0;
	}
}