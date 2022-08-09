package com.myhome.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myhome.web.dept.model.DeptDTO;
import com.myhome.web.dept.service.DeptService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class); 	// 로그인 기능
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		logger.info("Welcome index"); 						// 로그인 출력 (로그기록)
		
		List<DeptDTO> deptDatas = deptService.getAll();
		
		model.addAttribute("deptDatas", deptDatas);
		
		return "index";
	}
	
}
