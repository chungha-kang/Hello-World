package com.myhome.web.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myhome.web.login.model.PermissionDAO;

@Component
@Aspect
public class PermissionAOP {
	
	/*
	 * 1. 로그인을 하면 권한 정보를 가지는
	 *    객체를 세션에 저장하고
	 *    세션에 저장된 권한 정보를 확인한다.
	 *    (이 방식은 DAO 불필요)
	 *    
	 * 2. 로그인을 한 유저들의 정보를 세션에서
	 *    찾아서 서비스 요청할 때 마다 권한테이블
	 *    의 정보를 조회하여 확인한다.
	 *    (이 방식은 DAO 필요)
	 *    
	 * 어떤 서비스의 권한을 확인해야 하는지 구분하기
	 * 위한 값이 필요.
	 */
	
	@Autowired
	private PermissionDAO dao;
										// 패키지			    //클래스//메서드
	@Pointcut(value="execution(public * com.myhome.web.*.service.*Service.get*(javax.servlet.http.HttpSession, ..))")
	private void permSelectCut() {}
	
	@Pointcut(value="execution(public * com.myhome.web.*.service.*Service.add*(javax.servlet.http.HttpSession, ..))")
	private void permInsertCut() {}
	
	@Pointcut(value="execution(public * com.myhome.web.*.service.*Service.modify*(javax.servlet.http.HttpSession, ..))")
	private void permUpdateCut() {}
	
	@Pointcut(value="execution(public * com.myhome.web.*.service.*Service.remove*(javax.servlet.http.HttpSession, ..))")
	private void permDeleteCut() {}
	
	@Before(value="permSelectCut()")
	public void beforePermSelect(JoinPoint joinPoint) throws Exception {
		System.out.println(joinPoint.getSignature().toShortString());
		System.out.println(joinPoint.getSignature().toLongString());
	}
	
	@Before(value="permInsertCut()")
	public void beforePermInsertCut(JoinPoint joinPoint) throws Exception {
		
	}
	
	@Before(value="permUpdateCut()")
	public void beforePermUpdateCut(JoinPoint joinPoint) throws Exception {
		
	}
	
	@Before(value="permDeleteCut()")
	public void beforePermDeleteCut(JoinPoint joinPoint) throws Exception {
		
	}
}
