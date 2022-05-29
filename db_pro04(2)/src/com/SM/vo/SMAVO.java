package com.SM.vo;

import java.sql.Date;

/*
 * 회원 가입을 위한 사용자 정보를 담고 있는 객체로 활용
 * (VO : Value Object)
 * 멤버 변수에 대한 getter/setter 필요.
 */
public class SMAVO {
	private String ID;			// 아이디
	private String PASSWORD;	// 패스워드
	private String Name;		// 사용자명
	private int EMPLOYEE_ID;	// 사번
	private Date CreateDate;	// 계정생성일
}
