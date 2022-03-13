package exam02;

import java.util.Scanner;
public class Sample02_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.println("다음의 메뉴 번호 중 하나를 입력하시오.");
		for(int i = 0; i < 3; i++) {
			System.out.println("1. 조회");
			System.out.println("2. 추가");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("9. 종료");
			System.out.println(": ");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					System.out.println("조회 메뉴를 선택했습니다.");
					break;
				case 2:
					System.out.println("추가 메뉴를 선택했습니다.");
					break;
				case 3:
					System.out.println("수정 메뉴를 선택했습니다.");
					break;
				case 4:
					System.out.println("삭제 메뉴를 선택했습니다.");
					break;
				case 9:
					System.out.println("프로그램을 종료 합니다.");
					break;
				default:
					System.out.println("잘못된 메뉴 번호 입니다. 다시 입력하세요.");
			}
		}
		System.out.println();
		System.out.println();

		// flag 변수 활용법
		int menu2;
		boolean existed = false;
		
		System.out.println("다음의 메뉴 번호 중 하나를 입력하시오.");
		for(int i = 0; i < 3; i++) {
			System.out.println("1. 조회");
			System.out.println("2. 추가");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("9. 종료");
			System.out.println(": ");
			menu2 = sc.nextInt();
			switch(menu2) {
				case 1:
					System.out.println("조회 메뉴를 선택했습니다.");
					existed = true;
					break;
				case 2:
					System.out.println("추가 메뉴를 선택했습니다.");
					existed = true;
					break;
				case 3:
					System.out.println("수정 메뉴를 선택했습니다.");
					existed = true;
					break;
				case 4:
					System.out.println("삭제 메뉴를 선택했습니다.");
					existed = true;
					break;
				case 9:
					System.out.println("프로그램을 종료 합니다.");
					existed = true;
					break;
				default:
					System.out.println("잘못된 메뉴 번호 입니다. 다시 입력하세요.");
			}
			if(existed) {
				break;
			}
		}
	}

}
