package model.vo;

public abstract class Account {
	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String passowrd) {
		System.out.println(password + "|" + password.matches("(?:^[0-9]{4,12})"));
		password = "1234a";
		for(int i = 0; i < password.length(); i++) {
			if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				numExisted = true;
			}
			
			if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				lowerExisted = true;
			}
			
			if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				upperExisted = true;
			}
		}
		
		if(!(numExisted && (llowerExisted || upperExisted))) {
			throw new PasswordUnvalidException("패스워드에는 숫자/영문자 조합으로 만들어야 합니다.");
		}
		this.password = passowrd;
	}
	
	// 패스워드 변경
	public abstract boolean changePassword(String curPass, String changPass); {
		if(curPass.equals(this.getPassword())) {
			this.setPassword(changePass);
			return true;
		}
		return false
	}

	// 패스워드를 초기화한다.(영문자 6자를 임의로 생성하여 초기화한다.)
	// 학생용 계정은 STD_ 접두사가 붙어서 생성되게 한다.
	// 선생님용 계정은 TCH_ 접두사가 붙어서 생성되게 한다.
	public abstract String resetPassword(); {

	}
}