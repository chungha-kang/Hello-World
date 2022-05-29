package com.md.menu;

import java.util.Scanner;

import com.md.MDAccount_t;
import com.md.Menu;
import com.md.ctrl.ManageControl;

public class MenuInput {
	private Scanner sc = new Scanner(System.in);
	private ManageControl mngCtrl = new ManageControl();
	private Menu menu = new Menu();
	
	public void menu() throws Exception {
		while(true) {
			System.out.print(menu.login());
			System.out.print("입력하세요 : ");
			String input = sc.nextLine();

			switch(input) {
				// 1. 로그인
				case "1":
					this.BeforeMainMenu();	break;
				// 2. 관리자 메뉴
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
		
		MDAccount_t account = mngCtrl.login(ID, PASSWORD);
		
		if(account != null) {
			System.out.printf("%s 님이 로그인을 하였습니다.\n", account.getID());
			mainMenu(account);
		} else {
			System.out.println("로그인에 실패하였습니다.");
		}
	}
	
	private void mainMenu(MDAccount_t account) throws Exception {
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.print(menu.mainMenu(account.getName()));
			System.out.print("입력하세요 : ");
			String input = sc.nextLine();
			
			switch(input) {
				// 1. 상품 및 재고 현황
				case "1":
					this.viewProduct();	break;
				// 2. 상품 및 재고 등록
				case "2":
					this.regiProduct();	break;
				// 3. 상품 및 재고 수정
				case "3":
					this.modiProduct();	break;
				// 4. 상품 및 재고 등록
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
	
	private void viewProduct() {
		System.out.println();
	}
	
	private void regiProduct() {
		
	}
	
	private void modiProduct() {
		
	}
	
	private void Calculate() {
		
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
		MDAccount_t data = new MDAccount_t();
		System.out.print("   ID    : ");
		data.setID(sc.nextLine());
		System.out.print("PASSWORD : ");
		data.setPASSWORD(sc.nextLine());
		System.out.print("  NAME   : ");
		data.setName(sc.nextLine());
		System.out.print("EMPLOYEE_ID : ");
		data.setEMPLOYEE_ID(sc.nextLine());

		boolean result = mngCtrl.join(data);
		
		if(result) {
			System.out.println(data.getID() + "가입이 완료 되었습니다.");
		} else {
			System.out.println("회원 가입을 할 수 없습니다.(중복된 아이디가 있습니다.)");
		}
		Thread.sleep(500);
	}
	
	private void modiEmployee() {
		
	}
	
	private void deleEmployee() {
		
	}
}