package exam01;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		/*
		 * switch 문
		 * 		- if 문은 주로 값의 범위에 따라 특정 코드를 실행하도록 하기 위한 용도로 사용하지만
		 * 		  switch 문은 주로 식의 하나의 결과값에 해당하는 경우 특정 코드를 실행하기 위한 용도로 사용한다.
		 * 		- 주로 메뉴 번호를 선택하고 특정 메뉴에 대한 코드를 실행 시킬 때 사용.
		 * 		- switch 는 if 문과 다르게 조건이 만족한다고 해서 해당 조건에 해당하는 코드만 수행하고 종료되지 않는다.
		 * 		  조건이 만족한 case 부터 수차적으로 모든 case 의 코드를 실행한다.
		 * 		  이러한 특정 때문에 특정 case 의 코드만 실행하고 종료되기 원하는 경우 break 문을 사용하여 종료시켜야 한다.
		 */

		/*
		 * switch 사용 형식
		 * 		switch(식) {
		 * 			case 식에대한결과값1:
		 * 				결과값1에 해당하는 경우 실행할 코드
		 * 				break;
		 * 
		 * 			case 식에대한결과값2:
		 * 				결과값2에 해당하는 경우 실행할 코드
		 * 				break;
		 * 
		 * 			case ...:
		 * 
		 * 			default:
		 * 				위에 나열한 case에 해당하지 않는 경우 실행할 코드
		 * 				if 문의 else 처럼 옵션이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음에 나열된 메뉴중 하나의 번호를 입력하세요.");
		System.out.print("1. 조회\n2. 추가\n3. 수정\n4. 삭제\n9. 종료\n");
		System.out.print(": ");
		int menu = sc.nextInt();
		
		switch(menu) {		// (menu 위치에 case에 대한 조건식이 들어감)
		case 1 :
			System.out.println("데이터 조회 메뉴를 선택했습니다.");
			break;
		case 2 :
			System.out.println("데이터 추가 메뉴를 선택했습니다.");
			break;
		case 3 :
			System.out.println("데이터 수정 메뉴를 선택했습니다.");
			break;
		case 4 :
			System.out.println("데이터 삭제 메뉴를 선택했습니다.");
			break;
		case 9 :
			System.out.println("프로그램을 종료 합니다.");
			break;		// 마지막 case 는 굳이 break 를 쓰지 않아도 된다.
		default :
			System.out.println("메뉴 번호를 잘못 입력하였습니다.");
		}
	}

}
