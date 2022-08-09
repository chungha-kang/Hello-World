package com.myhome.web.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myhome.web.login.vo.LoginVO;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String login(Model model, HttpServletRequest res) {
//		
//		logger.info("empId : {}" + res.getParameter("empId"));
//		logger.info("deptId : {}" + res.getParameter("deptId"));
//		logger.info("empName : {}" + res.getParameter("empName"));
		
//	public String login(Model model, int empId, int deptId, String empName) {
//															
//		logger.info("empId : {}" + empId);
//		logger.info("deptId : {}" + deptId);
//		logger.info("empName : {}" + empName);
		
//	public String login(Model model
//			, @RequestParam("id") int empId
//			, @RequestParam("deptId") int deptId
//			, @RequestParam("name") String empName) {
//		
//		logger.info("empId : {}" + empId);
//		logger.info("deptId : {}" + deptId);
//		logger.info("empName : {}" + empName);

//	public String login(Model model, LoginVO loginVo) {
//		
//		logger.info("empId : {}" + loginVo.getEmpId());
//		logger.info("deptId : {}" + loginVo.getDeptId());
//		logger.info("empName : {}" + loginVo.getEmpName());
		
	public String login(Model model, LoginVO loginVo, HttpSession session) {
		logger.info("lgoin({}, {}, {})", loginVo.getEmpId(), loginVo.getDeptId(), loginVo.getEmpName());
		
		boolean result = service.login(session, loginVo);
		
		if(result) {
			// 로그인 성공
		} else {
			// 로그인 실패
		}
		
		return "";
		
	}
}
