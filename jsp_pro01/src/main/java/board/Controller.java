package board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.model.DeptDTO;
import dept.service.DeptService;

@WebServlet("/board/mod")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private BoardService service = new BoardService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		Board b = BoardService.updateBoard(id);
		
		request.setAttribute("data", b);
		
		String view = "/WEB-INF/views/bdetail.jsp";
		request.getRequestDispatcher(view).forward(request, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bId = request.getParameter("bId");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		
		int result = service.updateBoard(b);
		
		String view = "/views/common/errorPage.jsp";
		
		switch(result) {
		case 1:
			response.sendRedirect(request.getContextPath() + "/bdetail");
			return;
		case 0:
			request.setAttribute("error", true);
			request.setAttribute("errorMsg", "게시글 수정 실패");
			break;
		case -1:
			request.setAttribute("error", true);
			request.setAttribute("errorMsg", "게시글 수정 실패");
			break;
	}
	request.getRequestDispatcher(view).forward(request, response);
}

}
