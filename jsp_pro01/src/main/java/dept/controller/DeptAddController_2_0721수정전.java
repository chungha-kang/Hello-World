package dept.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.model.DeptDTO;
import dept.service.DeptService;

@WebServlet("/depts/add2")
public class DeptAddController_2_0721수정전 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DeptService service = new DeptService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "/WEB-INF/jsp/dept/add.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptId = request.getParameter("deptId");
		String deptName = request.getParameter("deptName");
		String mngId = request.getParameter("mngId");
		String locId = request.getParameter("locId");
		
		/*
		 * 사용자로부터 전달 받은 데이터를 service에 전달하고
		 * service는 전달 받은 데이터를 dao에 전달하고
		 * service에서는 필요한 경우 전달 받은 데이터에 대한 비지니스 로직을 수행 후 dao 에 전달 할 수 있다.
		 * dao에서는 전달 받은 데이터를 처리하기에 적절한 SQL 구문을 찾아서 처리할 수 있게 한다.
		 */
		
		DeptDTO data = service.addDept(deptId, deptName, mngId, locId);
		
		request.setAttribute("data", data);
		
		String view = "/WEB-INF/jsp/dept/add.jsp";
		if(data != null) {
			if(data.getDeptId() != -1 && data.getMngId() != -1 && data.getLocId() != -1) {
				// 저장 성공 후 리다이렉트를 사용하여 페이지를 이동하게 함
				response.sendRedirect(request.getContextPath() + "/depts?search=" + data.getDeptId());
			} else {
				Map<String, String> error = new HashMap<String, String>();
				
				if(data.getDeptId() == -1) {
					error.put("deptId", "동일한 부서 ID가 존재합니다.");
				}
				if(data.getMngId() == -1) {
					error.put("mngId", "관리자ID 정보가 존재하지 않습니다.");
				}
				if(data.getLocId() == -1) {
					error.put("locId", "지역ID 정보가 존재하지 않습니다.");
				}
				request.setAttribute("error", error);
				request.getRequestDispatcher(view).forward(request, response);
			}
		} else {
			// 저장 실패 후 기존 페이지를 유지하면서 사용자가 입력했던 데이터도 최대한 보존
			request.getRequestDispatcher(view).forward(request, response);
		}
		
	}

}
