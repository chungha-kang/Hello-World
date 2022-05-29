package com.md;

public class Test {

	public static void main(String[] args) {
		public String manageMenu(String username) {
			String s = "";
			s += "<<< " + username + "님 환영 합니다. >>>\n";
			s += "┌───────────────────────┐\n";
			s += "│ 1. 정보 수정          │\n";
			s += "│ 2. 회원 탈퇴          │\n";
			s += "│ 3. 로그 아웃          │\n";
			s += "└───────────────────────┘\n"; 
			
			return s;
		}
	}
}
