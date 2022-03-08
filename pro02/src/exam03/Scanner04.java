package exam03;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 값 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 값 입력 : ");
		int num2 = sc.nextInt();
		
		int result = num1 + num2 ;
		System.out.printf("결과 : %d", result);
		
		
		
		// int 선언 미리 하기
		
		//Scanner sc = new Scanner(System.in);
		//int num1, num2;
		
		//System.out.print("첫 번째 정수 값 입력 : ");
		//num1 = sc.nextInt();
		
		//System.out.print("두 번째 정수 값 입력 : ");
		//num2 = sc.nextInt();
		
		//int result = num1 + num2 ;
		//System.out.printf("결과 : %d", result);
		
		
	}

}
