package locs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import locs.model.LocsDTO;
import locs.service.LocsService;

@WebServlet("/locs/mod")
public class LocstModController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LocsService service = new LocsService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		LocsDTO data = service.getId(id);
		
		request.setAttribute("data", data);
		
		String view = "/WEB-INF/jsp/locs/mod.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String locId = request.getParameter("locId");
		String stAddr = request.getParameter("stAddr");
		String postal = request.getParameter("postal");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String ctyId = request.getParameter("ctyId");
		
		LocsDTO data = new LocsDTO();
		data.setLocId(Integer.parseInt(locId));
		data.setStAddr(stAddr);
		data.setPostal(postal);
		data.setCity(city);
		data.setState(state);
		data.setCtyId(ctyId);

		
//방법2	service.modifyLocs(data);
//방법1	service.modifyLocs(locsId, locsName, mngId, locId);
		int result = service.modifyLocs(data);
		
		String view = "/WEB-INF/jsp/locs/mod.jsp";
		request.setAttribute("data", data);
		
		switch(result) {
			case 1:
				response.sendRedirect("/jsp01/locs?search=" + data.getLocId());
				break;
			case 0:
				request.setAttribute("errorMsg", "수정 작업 중 알수 없는 문제가 발생하였습니다.");
				request.getRequestDispatcher(view).forward(request, response);
				break;
			case -1:
				request.setAttribute("errorMsg", "관리자가 존재하지 않습니다.");
				request.getRequestDispatcher(view).forward(request, response);
				break;
			case -2:
				request.setAttribute("errorMsg", "해당 지역이 존재하지 않습니다.");
				request.getRequestDispatcher(view).forward(request, response);
				break;
		}
	}

}
