package exam01;

import java.util.Scanner;
 

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 통해 정수 값을 입력 받아 다음의 문제를 푸시오.
		 *	1. 사용자 입력값의 범위를 설정하여 입력값의 범위를 초과하는 경우 주의 메세지를 출력한다.
		 * 		입력값의 범위 : 1 ~ 99
		 * 		입력값의 범위를 벗어난 경우 "1 ~ 99 사이의 값을 입력하시오." 라는 메세지를 출력
		 * 		올바른 입력값의 범위를 입력한 경우 "정수값이 정상적으로 입력되었습니다." 라는 메세지를 출력
		 */ 

		Scanner sc = new Scanner(System.in);
		int num;
		// int num = sc.nextInt();

		System.out.print("정수값을 입력하세요. : ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			System.out.println("정수값이 정상적으로 입력되었습니다.");
		} else {
			System.out.println("1 ~ 99 사이의 값을 입력하시오.");
		}
		
		/* 
		 *	2. 0 ~ 100 사이의 정수 값을 입력 받아 다음 조건에 해당하는 경우 적절한 메세지를 출력하도록 한다.
		 *  	입력된 정수 값이 0 ~ 39 사이의 값인 경우 "과락입니다." 메세지를 출력
		 *		입력된 정수 값이 40 ~ 59 사이의 값인 경우 "E 등급 입니다." 메세지를 출력
		 *		입력된 정수 값이 60 ~ 69 사이의 값인 경우 "D 등급 입니다." 메세지를 출력
		 *		입력된 정수 값이 70 ~ 79 사이의 값인 경우 "C 등급 입니다." 메세지를 출력
		 *		입력된 정수 값이 80 ~ 89 사이의 값인 경우 "B 등급 입니다." 메세지를 출력
		 *		입력된 정수 값이 90 ~ 100 사이의 값인 경우 "A 등급 입니다." 메세지를 출력
		 */
		
		System.out.print("점수를 입력하세요. : ");
		num = sc.nextInt();
		// int jumsu = sc.nextInt();
		
		if (num >= 0 && num <= 39) {
			System.out.println("과락입니다.");
		} else if(num <= 59) {
			System.out.println("E 등급 입니다.");
		} else if(num <= 69) {
			System.out.println("D 등급 입니다.");
		} else if(num <= 79) {
			System.out.println("C 등급 입니다.");
		} else if(num <= 89) {
			System.out.println("B 등급 입니다.");
		} else if(num <= 100) {
			System.out.println("A 등급 입니다.");
		} else {
			System.out.println("0 ~ 100 사이의 정수를 입력하세요.");
		}
		
		// 쉽게 출력 하는 법
		
		String result = "";		// String result; 이걸 초기화 시켜서 선언 시켜줘야 한다.
		int jumsu;
		
		System.out.print("점수를 입력하세요(0 ~ 100) : ");
		jumsu = sc.nextInt();
		
		if(jumsu <= 39) {
			result = "과락입니다.";
		} else if(jumsu <= 59) {
			result = "E 등급 입니다.";
		} else if(jumsu <= 69) {
			result = "D 등급 입니다.";
		} else if(jumsu <= 79) {
			result = "C 등급 입니다.";
		} else if(jumsu <= 89) {
			result = "B 등급 입니다.";
		} else if(jumsu <= 100) {
			result = "A 등급 입니다.";
		}
		
		System.out.println(result);
		
	}

}
