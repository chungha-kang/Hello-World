package locs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import locs.model.LocsDTO;
import locs.service.LocsService;

@WebServlet("/locs/add")
public class LocsAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LocsService service = new LocsService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/jsp/locs/add.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String locId = request.getParameter("locId");
		String stAddr = request.getParameter("stAddr");
		String postal = request.getParameter("postal");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String ctyId = request.getParameter("ctyId");
		
		/*
		 * 사용자로부터 전달 받은 데이터를 service에 전달하고
		 * service는 전달 받은 데이터를 dao에 전달하고
		 * service에서는 필요한 경우 전달 받은 데이터에 대한 비지니스 로직을 수행 후 dao 에 전달 할 수 있다.
		 * dao에서는 전달 받은 데이터를 처리하기에 적절한 SQL 구문을 찾아서 처리할 수 있게 한다.
		 */
		
		LocsDTO data = service.addLoc(locId, stAddr, postal, city, state, ctyId);
		
		String view = "/WEB-INF/jsp/locs/add.jsp";
		if(data != null) {
			if(data.getLocId() == -1) {
				request.setAttribute("error", data);
				request.setAttribute("errorMsg", "지역 ID 중복!");
				request.getRequestDispatcher(view).forward(request, response);
				/*
			} else if(data.getPostal() == -1) {
				request.setAttribute("error", data);
				request.setAttribute("errorMsg", "해당 우편번호 없음");
				request.getRequestDispatcher(view).forward(request, response);
			} else if(data.getCtyId() == -1) {
				request.setAttribute("error", data);
				request.setAttribute("errorMsg", "해당 시 이름 없음");
				request.getRequestDispatcher(view).forward(request, response);
				*/
			} else {
				// 저장 성공 후 리다이렉트를 사용하여 페이지를 이동하게 함
				response.sendRedirect(request.getContextPath() +"/depts?search=" + data.getLocId());
			}
		} else {
			// 저장 실패 후 기존 페이지를 유지하면서 사용자가 입력했던 데이터도 최대한 보존
			System.out.println("저장 실패");
			request.getRequestDispatcher(view).forward(request, response);
		}
		
	}

}
