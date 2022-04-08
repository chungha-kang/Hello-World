package model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Account {
	private Date loginDate;		// 로그인 시간
	
	public Teacher(String name) {
		setName(name);
		setPassword("1111");	// 초기 비밀번호
	}

	public Teacher(String name, String password) {
		setName(name);
		setPassword(password);
	}

	public Date getLoginDate() {
		return loginDate;
	}
	
	public String getLoginDateFormat() {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		return sFormat.format(loginDate);
	}
	
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
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
		// TODO Auto-generated method stub
		return null;
	}

}