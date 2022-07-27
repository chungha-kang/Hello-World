package dept.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.util.Parameter;
import dept.model.DeptDTO;
import dept.service.DeptService;

@WebServlet("/depts2")
public class DeptController주석삭제전 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DeptService service = new DeptService();
	
	/*
	(class Parameter 에 담음)
	private String defaultValue(HttpServletRequest request, String paramName, String defValue) {
		String result = request.getParameter(paramName) == null ? defValue : request.getParameter(paramName);
		result = result.isEmpty() ? defValue : result;
		result = result.matches("\\d+") ? result : defValue;		
		return defValue;
	}
	*/
	private Parameter param = new Parameter();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");
		//String pageCount = this.defaultValue(request, "pgc", "10");
		//String page = this.defaultValue(request, "page", "1");
		//int pageCount = param.defaultIntValue(request, "pgc", "10");
		int page = param.defaultIntValue(request, "page", "1");
		int pageCount = 0;
		
		/*
		(private String defaultValue 에 담음)
		String pageCount = request.getParameter("pgc") == null ? "10" : request.getParameter("pgc");
		String page = request.getParameter("page") == null ? "1" : request.getParameter("page");
		page = page.isEmpty() ? "1" : page;
		page = page.matches("\\d+") ? page : "1";
		pageCount = pageCount.isEmpty() ? "10" : pageCount;
		pageCount = page.matches("\\d+") ? pageCount : "10";
		*/
		
		HttpSession session = request.getSession();
		boolean pageCountCookieExist = false;
		
		if(session.getAttribute("pageCount") != null) {
			pageCount = Integer.parseInt(session.getAttribute("pageCount").toString());
			pageCountCookieExist = true;
		}
		
		if(request.getParameter("pgc") != null || !pageCountCookieExist) {
			pageCount = param.defaultIntValue(request, "pgc", "10");
		}
		session.setAttribute("pageCount", pageCount);
		request.setAttribute("page", page);
		request.setAttribute("pageCount", pageCount);
		
		/*
		session.setAttribute("pageCount", page);
		session.removeAttribute("pageCount"); // 세션에 설정한 pageCount 속성 제거
		session.setMaxInactiveInterval(60*60*24);
		session.invalidate(); // 세션 만료 시켜 새로운 세션을 만들 수 있게 한다.
		request.getSession(true); // 유효한 세션이 없는 경우 새로 만들고 유효한 세션이 있는 경우 해당 세션 정보를 가져온다.
		request.getSession(false); // 유요한 세션이 없는 경우 null 반환, 유요한 세션이 있는 경우 해당 세션 정보를 가져온다.
		*/
		
		/*
		boolean pageCountCookieExist = false;
		Cookie[] cookies = request.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("pageCount")) {
				pageCount = Integer.parseInt(c.getValue());
				pageCountCookieExist = true;
			}
		}
		
		if(request.getParameter("pgc") != null || !pageCountCookieExist) {
			pageCount = param.defaultIntValue(request, "pgc", "10");
		}

		request.setAttribute("page", page);
		request.setAttribute("pageCount", pageCount);
		
		Cookie cookie = new Cookie("pageCount", String.valueOf(pageCount));
		// 시간은 초단위 설정 (60*60*24*30*12) = 1년
		// -1 로 설정하면 무한:session, 0 으로 설정하면 즉시 만료
		cookie.setMaxAge(60*60*24*30*12); 
		cookie.setPath("/"); // 쿠키 사용 경로 설정(하위 경로 포함)
		response.addCookie(cookie);
		*/
		
		List<DeptDTO> deptDatas = null;
		if(search == null) {
			deptDatas = service.getPage(page, pageCount);
			request.setAttribute("pageList", service.getPageList(pageCount));
		} else {
			boolean isNumber = search.matches("\\d+");
			if(isNumber) {
				DeptDTO data = service.getId(search);
				if(data != null) {
					deptDatas = new ArrayList<DeptDTO>();
					deptDatas.add(data);
				}
			}
		}
		
		request.setAttribute("deptDatas", deptDatas);
		
		String view = "/WEB-INF/jsp/dept/index.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

}


/*
package dept.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.model.DeptDTO;
import dept.service.DeptService;

@WebServlet("/depts")
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DeptService service = new DeptService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search = request.getParameter("search");

		List<DeptDTO> deptDatas = null;
		if(search == null) {
			int page = 1;
			if(request.getParameter("page") == null) {
				deptDatas = service.getAll();
			} else if(request.getParameter("page").isEmpty()) {
				deptDatas = service.getPage(page);
			} else {
				if(request.getParameter("page").matches("\\d+")) {
					page = Integer.parseInt(request.getParameter("page"));
				}
				deptDatas = service.getPage(page);
			}
			request.setAttribute("pageList", service.getPageList());
		} else {
			boolean isNumber = search.matches("\\d+");
			if(isNumber) {
				DeptDTO data = service.getId(search);
				if(data != null) {
					deptDatas = new ArrayList<DeptDTO>();
					deptDatas.add(data);
				}
			}
		}
		
		request.setAttribute("deptDatas", deptDatas);
		
		String view = "/WEB-INF/jsp/dept/index.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

}
*/
