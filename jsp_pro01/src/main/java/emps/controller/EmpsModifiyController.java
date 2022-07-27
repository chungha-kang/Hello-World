package emps.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dept.service.DeptService;
import emps.model.EmpDTO;
import emps.model.EmpDetailDTO;
import emps.service.EmpService;
import job.service.JobService;

@WebServlet("/emps/modify")
@MultipartConfig
public class EmpsModifiyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String view = "/WEB-INF/jsp/emps/modify.jsp";
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		EmpService empService = new EmpService();
		DeptService deptService = new DeptService();
		JobService jobService = new JobService();
		
		EmpDTO data = empService.getId(id);
		EmpDetailDTO dataDetail = empService.getDetail(data.getEmpId());
		
		request.setAttribute("data", data);
		request.setAttribute("dataDetail", dataDetail);
		request.setAttribute("deptDatas", deptService.getAll());
		request.setAttribute("jobDatas", jobService.getAll());
		
		String imagePath = empService.getProfileImage(request, "/static/img/emp/", data);
		request.setAttribute("imagePath", imagePath);
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId = request.getParameter("empId");
		String empName = request.getParameter("empName");
		String jobId = request.getParameter("jobId");
		String deptId = request.getParameter("deptId");
		String email = request.getParameter("email");
		String hireDate = request.getParameter("hireDate");
		String phone = request.getParameter("phone");
		String salary = request.getParameter("salary");
		String commission = request.getParameter("commission");
		
		EmpService empService = new EmpService();
		
		EmpDTO empData = empService.getId(empId);
		if(empData == null) {
			request.getSession().setAttribute("error", "해당 데이터는 존재하지 않습니다.");
			response.sendRedirect(request.getContextPath() + "/error");
			return;
		}
		empData.setEmpName(empName);
		empData.setJobId(jobId);
		empData.setDeptId(deptId);
		empData.setEmail(email);
		
		EmpDetailDTO empDetailData = empService.getDetail(empData.getEmpId());
		if(empData == null) {
			request.getSession().setAttribute("error", "해당 데이터는 존재하지 않습니다.");
			response.sendRedirect(request.getContextPath() + "/error");
			return;
		}
		empDetailData.setEmpId(empId);
		empDetailData.setHireDate(hireDate);
		empDetailData.setPhone(phone);
		empDetailData.setSalary(salary);
		empDetailData.setCommission(commission);
		
		boolean result = empService.setEmployee(empData, empDetailData);
		
		if(result) {
			// 추가 작업 성공
			Part part = request.getPart("uploadImage");
			
			if(!part.getSubmittedFileName().isEmpty()) {
				String realPath = request.getServletContext().getRealPath("/static/img/emp/");
				part.write(realPath + empData.getEmpId() + ".png");
			}
			
			response.sendRedirect(request.getContextPath() + "/emps/detail?id=" + empData.getEmpId());
		} else {
			doGet(request, response);
		}
	}

}
