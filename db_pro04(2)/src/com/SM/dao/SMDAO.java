package com.SM.dao;

import com.SM.vo.SMAVO;

/*
 * 회원 가입 처리를 위해 데이터베이스에 직접 엑세스 
 * 하기 위한 객체로 활용 
 *  * (DAO : Data Access Object)
 */
public class SMDAO {
	
	// 회원 가입 처리를 담당
	public boolean register(SMAVO data) {
		return false;
	}

	// 회원 정보 수정을 담당
	public boolean update(SMAVO data) { 
		return false;
	}
	
	// 회원 정보 삭제를 담당
	public boolean remove(SMAVO data) {
		return false;
	}

	// userid 에 해당하는 회원 정보를 반환
	public SMAVO get(String userid) {
		return null;
	}
}
