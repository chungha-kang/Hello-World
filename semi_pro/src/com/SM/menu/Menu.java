package com.SM.menu;

public class Menu {

	public String login() {
		String s = "";
		s += "<<< Stock Manager ver.01 >>>\n";
		s += "┌───────────────────────┐\n";
		s += "│ 1. 로그인		│\n";			// to mainMenu
		s += "│ 2. 관리자 메뉴		│\n";		// to manageMenu
		s += "│ 3. 종료			│\n";		// exit
		s += "└───────────────────────┘\n";
		
		return s;
	}
	
	public String mainMenu(String Name) {
		String s = "";
		s += "<<< " + Name + "님 접속 하였습니다. >>>\n";
		s += "┌───────────────────────┐\n";
		s += "│ 1. 상품 및 재고 현황	│\n";	// to viewProduct
		s += "│ 2. 상품 및 재고 등록	│\n";	// to regiProduct
		s += "│ 3. 상품 및 재고 수정	│\n";	// to modiProduct
		s += "│ 4. 마진율 계산기		│\n";	// to Calculate
		s += "│ 5. 돌아가기		│\n";		// to login
		s += "└───────────────────────┘\n";
		
		return s;
	}
	
	public String manageMenu() {
		String s = "";
		s += "<<< 관리자 메뉴 >>>\n";
		s += "┌───────────────────────┐\n";
		s += "│ 1. 직원 등록		│\n";		// to regiEmployee
		s += "│ 2. 직원 정보 수정		│\n";	// to modiEmployee
		s += "│ 3. 직원 정보 삭제		│\n";	// to deleEmployee
		s += "│ 4. 돌아가기		│\n";		// to login
		s += "└───────────────────────┘\n";
		
		return s;
	}
	
	public String marginCal() {
		String s = "";
		s += "<<< 마진율 계산기 ver.01 >>>\n";
		s += "┌───────────────────────┐\n";
		s += "│ 1. 일괄 계산(5% 단위)	│\n";		// to ctrlProduct
		s += "│ 2. 금액 직접 입력		│\n";		// to regiProduct
		s += "│ 3. 할인율 직접 입력	│\n";	// to modiProduct
		s += "│ 4. 등록 상품 외 계산	│\n";		// to Calculate
		s += "│ 5. 돌아가기		│\n";		// to manageMenu		
		s += "└───────────────────────┘\n";
		
		return s;
	}
	
}

	

