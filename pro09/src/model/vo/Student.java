package model.vo;

import java.util.Random;

// 과목 정보를 가지는 클래스
public class Student extends Account {
	/*
	 * 이름(name)과 성적배열(Grade) 를 정의
	 * getter/setter 도 작성
	 */
	private Grade[] grades;

	public Student(String name) {
		setName(name);
		setPassword("1111");
	}
	
	public Grade[] getGrades() {
		return grades;
	}
	
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public boolean changePassword(String curPass, String changPass) {
		if(curPass.equals(this.getPassword())) {
			this.setPassword(changPass);
			return true;
		}
		return false;
	}

	@Override
	public String resetPassword() {
		String prefix = "STD_";
		// 대소문자 영문자 구분하여 임의로 생성...
		// ACSII 코드를 활용.
		// 대문자 65 ~ 90
		// 소문자 97 ~ 122
		Random r = new Random();
		String newPass = "";
		if(r.nextBoolean()) {
			// 대문자
			for(int i = 0; i < 6; i++) {
				newPass += (char)(r.nextInt(26) + 65);
			}
		} else {
			// 소문자
			for(int i = 0; i < 6; i++) {
				newPass += (char)(r.nextInt(26) + 97);

		}

		return null;
	}
}
