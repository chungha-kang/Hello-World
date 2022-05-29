package com.join.controller;

import com.join.dao.JoinDAO;
import com.join.vo.JoinVO;

/*
 * 회원 가입 처리를 위한 중간 제어용 객체로 활용
 */

/*
 * 1. 사용자가 입력한 성별이 남/여 가 맞는지 확인을 하고,
 *    "남" 이면 'M' 으로 변경, "여" 이면 'F' 로 변경한다.
 *    입력값이 틀리면 false 로 반환한다.
 *    
 * 2. 사용자가 입력한 나이가 15 이상인지 확인하고
 *    15 이상이 아니면 false 로 반환한다.
 */
public class JoinController {

	private JoinDAO dao = new JoinDAO();
	
	public boolean join(JoinVO data) {
		switch(data.getGender()) {
			case '남' :
				data.setGender('M'); 	break;
			case '여' :
				data.setGender('F'); 	break;
			default :
				return false;
		}
		
		if(data.getAge() < 15) {
			return false;
		}
		
		JoinVO account = dao.get(data.getUserid());
		
		if(account != null) {
			return false;
		}
		
		boolean result = dao.register(data);
		return result;
	}
	
	public boolean update(JoinVO data) {
		/*
		 * 회원 정보 수정
		 * 반환 타입과 매개변수는 회원 정보 수정에 
		 * 필요한 타입으로 만들어 본다.
		 */
		return dao.update(data);
	}
	
	public boolean remove(JoinVO data) {
		/*
		 * 회원 탈퇴
		 * 반환 타입과 매개변수는 회원 탈퇴에 
		 * 필요한 타입으로 만들어 본다.
		 */
		return dao.remove(data);
	}
	
	public JoinVO login(String userid, String userpw) {
		JoinVO data = dao.get(userid);
		
		if(data.getUserpw().equals(userpw)) {
			return data;
		}
		
		return null;
	}
	
}
