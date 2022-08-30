package com.myhome.web.login.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.web.emp.model.EmpDTO;
import com.myhome.web.login.controller.LoginController;
import com.myhome.web.login.model.LoginDAO;
import com.myhome.web.login.vo.LoginVO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO dao;

	public boolean login(HttpSession session, LoginVO loginVo) {
		EmpDTO data = new EmpDTO(loginVo.getEmpId(), loginVo.getEmpName());
		data.setDeptId(loginVo.getDeptId());
		
		data = dao.selectEmployee(data);
		
		if(data == null) {
			return false;
		} else {
			// Map<String, PermDTO> permData = new HashMap<String, PermDTO>();
			// for(PermDTO perm: dao.selectPermission(data.getEmpId())) {
			// 	permData.put(perm.getTableName(), perm);
			// }
			
			// session.setAttribute("permData", permData);
			session.setAttribute("loginData", data);
			return true;
		}
	}
	
}
