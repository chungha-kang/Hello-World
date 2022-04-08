package controller;

import java.util.Date;
import java.util.Scanner;

import model.vo.Account;
import model.vo.Student;

// 학생용 메뉴
/*
 * 학생용 계정에 대해서도 패스워드를 저장할 수 있는 멤버 변수를
 * 별도로 생성한다.
 * 
 * loginAccount 에는 로그인을 한 학생의 정보가 있기 때문에
 * 이 정보를 활용하여 성적 조회를 할 때 자신의 정보가 바로 나오게 처리 한다.
 * 
 * 로그아웃 할 때 별도의 접속 기록을 남기지 않아도 된다.
 * 단, 출력에 대해서만 로그아웃 하였다는 메세지를 남긴다.
 */

public class StudentMenuManager {
	private DatabaseManager db = new DatabaseManager();
	private Scanner sc = new Scanner(System.in);
	private Account loginAccount;
	
	public StudentMenuManager(Student loginAccount) {
		this.loginAccount = loginAccount;
	}
	
	public void main() {
		StringBuilder menu = new StringBuilder();
		menu.append("1. 성적 조회\n");		// searchMenu()
		menu.append("2. 패스워드 변경\n");
		menu.append("9. 로그아웃\n");		// System.exit(0);
		menu.append(">>> ");
		while(true) {
			System.out.println(menu);
			
			String input = sc.nextLine();
			
			_clear();
			if(input.equals("1")) {
				searchMenu();
			} else if(input.equals("9")) {
				logout();
				return;
			}	
			_clear();
		}
	}
		private void logout() {
			loginAccount.setLoginDate(new Date());
			System.out.println(loginAccount.getName() + "님이 로그아웃 하였습니다.");
		}
		
		private void _clear() {
			for(int i = 0; i < 20; i++) {
				System.out.print("\n");
			}
		}
	}
}
