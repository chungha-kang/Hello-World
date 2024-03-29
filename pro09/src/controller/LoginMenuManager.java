package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.vo.Teacher;

public class LoginMenuManager {
		/*
		 * 해당 프로그램을 사용하기 위한 로그인 기능(LoginMenuManager)을 추가하도록 한다.
		 * 	1. 교사용 로그인
		 * 	2. 학생용 로그인
		 * 	3. 종료
		 * 
		 * 교사용 로그인은 teacherLogin 메서드를 만들어서 계정과 암호를 확인하도록 한다.
		 * 학생용 로그인은 studentLogin 메서드를 만들어서 계정과 암호를 확인하도록 한다.
		 * 	- 계정은 이름으로 사용한다.
		 * 	- 암호는 Student, Teacher 클래스에 별도의 password 멤버 변수를 만들어서
		 * 	  체크할 수 있게 한다.
		 * 
		 * 교사용으로 로그인을 한 경우
		 * 	성적 정보를 추가, 수정, 삭제, 조회 할 수 있는 모든 메뉴가 나온다.
		 * 
		 * 학생용으로 로그인 할 경우
		 * 	본인 성적에 대한 조회만 가능한 메뉴가 나오게 한다.
		 */
	
		private Scanner sc = new Scanner(System.in);
		private TeacherDatabaseManager tDB = new TeacherDatabaseManager();
		private SimpleDateFormat sFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	
		public void main() {
			StringBuilder menu = new StringBuilder();
			menu.append("1. 교사용 로그인\n");
			menu.append("2. 학생용 로그인\n");
			menu.append("3. 종료\n");	
			menu.append(">>> ");
			
			while(true) {
				System.out.println(menu);
				
				String input = sc.nextLine();
				
				_clear();
				if(input.equals("1")) {
					teacherLogin();
				} else if(input.equals("2")) {
					studentLogin();
				} else if(input.equals("3")) {
					System.out.println("프로그램을 종료 합니다.");
					System.exit(0);
				}	
				_clear();	
			}
		}
		
		private void resetPassword() {
			// 교사용... 학생용...
			//	1. 아이디(이름)만 입력하면 교사용에서 학생용에서 동일한 계정을 찾아서 변경하게 한다.
			//	2. 교사용, 학생용을 먼저 선택 후 선택한 항목에 대해 동일한 계정을 찾아서 변경하게 한다.
			
		}
		
		private void _clear() {
			for(int i = 0; i < 20; i++) {
				System.out.print("\n");
			}
		}
		
		private void teacherLogin() {
			System.out.println("교사용 로그인 입니다.");
			System.out.print("교사명 : ");
			String username = sc.nextLine();
			
			Teacher loginAccount = null;
			
			// 비밀번호 3회 입력 제한.
			for(int i = 0; i < 3; i++) {
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				loginAccount = tDB.login(username, password);
				if(loginAccount != null) {
					break;
				}
			}
			
			if(loginAccount == null) {
				System.out.println("로그인에 실패하였습니다. 다시 시도하세요.");
			} else {
				if(loginAccount.getLoginDate() == null) {
					System.out.println("환영합니다. 첫 로그인 입니다.");
				} else {
					Date now = new Date();
					System.out.println("최근 접속 시간은 " + loginAccount.getLoginDateFormat() + " 입니다.");
					System.out.println("현재 로그인 시간은 " + sFormat.format(new Date()) + "입니다.");
					loginAccount.setLoginDate(now);
				}
				StudentMenuManager sMenu = new StudentMenuManager(loginAccount);
				sMenu.main();
			}
			
			/*
			 * 로그인 검사 후 로그인이 성공하면
			 * 최근 로그인 시간과 현재 로그인 시간을 출력하고
			 * Teacher 객체에는 현재 로그인 시간을 loginDate 에
			 * 저장 후 MenuManager 를 실행한다.
			 * 
			 * 고명환 선생님이 접속하였습니다.
			 * 최근 접속 시간은 2022년 04월 04일 18시 30분 34초 입니다.
			 * 현재 로그인 시간은 2022년 04월 05일 09시 30분 30초 입니다.
			 * 
			 * 1. 성적 조회
			 * 2. 학생 정보 추가
			 * ...
			 * ...
			 * 
			 * MenuManager 의 프로그램 종료 메뉴는 로그아웃으로 바꾼다.
			 */


		}
		
		private void studentLogin() {
			System.out.println("학생용 로그인 입니다.");
		}

		
}
