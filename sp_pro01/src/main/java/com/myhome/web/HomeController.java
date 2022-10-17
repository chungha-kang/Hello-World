package com.myhome.web;

import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myhome.web.dept.model.DeptDTO;
import com.myhome.web.dept.service.DeptService;

@Controller
public class HomeController {
	@Autowired
	
	
	// 로그인 기능
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<DeptDTO> deptDatas = deptService.getAll();
		
		model.addAttribute("deptDatas", deptDatas);
		
		return "index";
	}
	
	@RequestMapping(value="/question", method=RequestMethod.POST)
	public String question(String sender, String context) {
		// root-context.xml 에 bean 생성, @Autowired 로 연결 -> .prop 에 정보 저장
//		JavaMailSender mailSender = null;
//		JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
//		senderImpl.setHost("smtp.gmail.com");			senderImpl.setPort(587);
//		senderImpl.setUsername("cubone89@gmail.com");	senderImpl.setPassword("tihqlpcfcnxpegif");
//		
//		Properties prop = new Properties();
//		prop.put("mail.smtp.auth", true);
//		prop.put("mail.smtp.starttls.enable", true);	prop.put("mail.smtp.sll.protocols", "TLSv1.3");
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		String[] to = {"cubone89@gmail.com"};	// 받는 사람 주소
		String[] cc = {};	// 참조 주소
		String[] bcc = {};	// 숨은 참조 주소
		message.setTo(to);
		message.setCc(cc);
		message.setBcc(bcc);
		
		message.setSubject("[" + sender + "] 님의 문의");
		message.setText(context);
		
		javaMailSender.send(message);
		return "redirect:/question;";
	}
}
