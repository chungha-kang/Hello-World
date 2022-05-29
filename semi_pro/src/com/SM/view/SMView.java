package com.SM.view;

import java.util.Scanner;

import com.SM.controller.SMController;
import com.SM.menu.Menu;
import com.SM.vo.SMAVO;
import com.SM.vo.SMCVO;

//Stock Manager View
public class SMView {
	private Scanner sc = new Scanner(System.in);
	private SMController SMC = new SMController();
	private Menu menu = new Menu();
	private SMAVO aData = new SMAVO();
	private SMCVO cData = new SMCVO();
	
	public void menu() throws Exception {
		while(true) {
			System.out.print(menu.login());
			System.out.print("입력하세요 : ");
			String input = sc.nextLine();

			switch(input) {
				// 1. 로그인 (to BeforeMainMenu -> to mainMenu)
				case "1":
					this.BeforeMainMenu();	break;
				// 2. 관리자 메뉴 (to manageMenu)
				case "2":
					this.manageMenu();	break;
				// 3. 종료
				case "3":
					System.out.println("프로그램이 종료 되었습니다.");
					System.out.println("좋은 하루 되세요.");
					System.exit(0);
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("재시작 합니다.");
					Thread.sleep(500);
			}
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		}
	}
	
	private void BeforeMainMenu() throws Exception {
		System.out.print("   ID    : ");
		String ID = sc.nextLine();
		
		System.out.print("PASSWORD : ");
		String PASSWORD = sc.nextLine();
		
		SMAVO account = SMC.login(ID, PASSWORD);
		
		if(account != null) {
			System.out.printf("%s 님이 로그인을 하였습니다.\n", account.getID());
			Thread.sleep(500);
			mainMenu(account);
		} else {
			System.out.println("로그인에 실패하였습니다.");
			Thread.sleep(500);
		}
	}
	
	private void mainMenu(SMAVO account) throws Exception {
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.print(menu.mainMenu(account.getName()));
			System.out.print("입력하세요 : ");
			String input = sc.nextLine();
			
			switch(input) {
				// 1. 상품 및 재고 현황
				case "1":
					this.viewProduct(null);	break;
				// 2. 상품 및 재고 등록
				case "2":
					this.regiProduct();	break;
				// 3. 상품 및 재고 수정
				case "3":
					this.modiProduct(input);	break;
				// 4. 마진율 계산기
				case "4":
					this.Calculate();	break;
				// 5. 돌아가기
				case "5":
					System.out.println("이전 메뉴로 돌아 갑니다.");
					Thread.sleep(500);
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("재시작 합니다.");
					Thread.sleep(500);
			}
		}
	}
	// 1. 상품 및 재고 현황
	private void viewProduct(SMCVO stock) throws Exception {
		System.out.println(SMC.view(stock));
	}
	
	// 2. 상품 및 재고 등록
	private void regiProduct() {
		System.out.print(" 상품번호 : ");
		cData.setProduct_no(sc.nextInt());
		System.out.print(" 브랜드명 : ");
		cData.setBrand_name(sc.nextLine());
		System.out.print(" 스타일넘버 : ");
		cData.setStyle_no(sc.nextLine());
		System.out.print(" 판매처 : ");
		cData.setStore(sc.nextLine());
		System.out.print(" 상품명 : ");
		cData.setProduct_name(sc.nextLine());
		System.out.print(" 정상가 : ");
		cData.setPrice(sc.nextInt());
		System.out.print(" 판매가 : ");
		cData.setSale_price(sc.nextInt());
		System.out.print(" 원가 : ");
		cData.setCost_price(sc.nextInt());
		System.out.print(" 세일율 : ");
		cData.setSale_per(sc.nextLine());
		System.out.print(" 마진율 : ");
		cData.setMargin_per(sc.nextLine());
		System.out.print(" 마진액 : ");
		cData.setMargin_won(sc.nextInt());
		System.out.print(" 재고수 : ");
		cData.setStock(sc.nextInt());
		System.out.print(" 담당MD : ");
		cData.setManagerID(sc.nextLine());
		
		boolean result = SMC.regi(cData);
		
		if(result) {
			System.out.printf("%s (%s) 가 등록 되었습니다.", cData.getProduct_name(), cData.getStyle_no());
		} else {
			System.out.println("오류가 발생하였습니다.");
		}
	}
	
	// 3. 상품 및 재고 수정
	private void modiProduct(String input) {
		System.out.println("아무것도 입력을 하지 않으면 이전 값을 유지 합니다.");
		System.out.println("수정 할 상품번호를 입력하세요.");
		System.out.print(">>> ");
		input = sc.nextLine();
		
		System.out.println("(상품번호에 대한 상품정보가 나온다.)");
		System.out.println("수정 할 내용을 입력하세요.");
		System.out.print(">>> ");
		
		System.out.println("개발중...");
		
		boolean result = SMC.update(aData);
		
		if(result) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}
	}
	
	// 4. 마진율 계산기
	private void Calculate() {
		System.out.println("개발중...");
	}
	
	
	
	
	private void manageMenu() throws Exception {
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.print(menu.manageMenu());
			System.out.print("입력하세요 : ");
			String input = sc.nextLine();
			
			switch(input) {
				// 1. 직원 등록
				case "1":
					this.regiEmployee();	break;
				// 2. 직원 정보 수정
				case "2":
					this.modiEmployee();	break;
				// 3. 직원 정보 삭제
				case "3":
					this.deleEmployee();	break;
				// 4. 돌아가기
				case "4":
					System.out.println("이전 메뉴로 돌아 갑니다.");
					Thread.sleep(500);
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					System.out.print("재시작 합니다.");
					Thread.sleep(500);
			}
		}
	}
	
	private void regiEmployee() throws Exception {		
		System.out.print("   ID    : ");
		aData.setID(sc.nextLine());
		System.out.print("PASSWORD : ");
		aData.setPASSWORD(sc.nextLine());
		System.out.print("  NAME   : ");
		aData.setName(sc.nextLine());
		System.out.print("EMPLOYEE_ID : ");
		aData.setEMPLOYEE_ID(sc.nextInt());

		boolean result = SMC.join(aData);
		
		if(result) {
			System.out.println(aData.getID() + "가입이 완료 되었습니다.");
		} else {
			System.out.println("회원 가입을 할 수 없습니다.(중복된 아이디가 있습니다.)");
		}
		Thread.sleep(500);
	}
	
	private void modiEmployee() {
		String input; //이게 맞냐?
		System.out.println("아무것도 입력을 하지 않으면 이전 값을 유지 합니다.");
		System.out.println("사번은 변경 할 수 없습니다.");
		
		System.out.println("변경 할 아이디를 입력하세요.");
		System.out.print(">>> ");
		input = sc.nextLine();
		input = input.isEmpty() ? aData.getID() : input;
		aData.setID(input);
		
		System.out.println("변경 할 패스워드를 입력하세요.");
		System.out.print(">>> ");
		input = sc.nextLine();
		input = input.isEmpty() ? aData.getPASSWORD() : input;
		aData.setPASSWORD(input);
		
		System.out.println("변경 할 이름을 입력하세요.");
		System.out.print(">>> ");
		input = sc.nextLine();
		input = input.isEmpty() ? aData.getName() : input;
		aData.setName(input);
		
		boolean result = SMC.update(aData);
		
		if(result) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}
	}
	
	private void deleEmployee() {
		if(SMC.remove(aData)) {
			System.out.println("탈퇴 처리가 완료 되었습니다.");
			return;
		} else {
			System.out.println("탈퇴 처리를 수행할 수 없습니다.");
		}
	}
}