package exam03;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
			/*
			 * 사용자 입력을 받기 위한 Scanner 클래스
			 * 		- 콘솔(터미널) 환경에서 사용자 입력을 받기 위해 사용.
			 * 		- 기본 기능이 아니기 때문에 import 구문이 필요하다. -> import java.utill.Scanner;
			 */
		
			// Scanner 객체 생성
			Scanner sc = new Scanner(System.in);
			//Scanner scanner = new Scanner(System.in);    -> Scanner = 객체 타입, sc = 객체 이름 (아무꺼나 써도 된다), new Scanner(System.in) = 객체 생성 -> "new S~를 sc에 할당"
			
			// 사용자 입력을 받고 재사용을 위해 변수에 저장.
			System.out.print("이름을 입력 하시오 : ");
			String sInput = sc.next();
			 
			// 변수에 저장된 사용자 입력 값을 출력.
			System.out.println("사용자 입력 값 : " + sInput);
			System.out.printf("사용자 입력 값 : %s\n", sInput);
	}
}
