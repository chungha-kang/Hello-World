package exam04;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// Scanner를 사용하여 사용자 입력을 받는다.
		// 입력 받은 값에 대해 산술연산을 수행하도록 만든다.
		
		/*
		 * 출력 형식
		 * 		첫 번째 값 입력 : 10
		 * 		두 번째 값 입력 : 15
		 * 		더하기 계산 결과 : 25
		 * 		빼기 계산 결과 : -5
		 * 		곱하기 계산 결과 : 
		 * 		나누기 계산 결과 : 0.6667
		 * 		나머지 계산 결과 : 10
		 * 
		 * 나누기 계산 결과는 실수값으로 나오게 한다. 그리고 반드시 소수점 4번째 자리까지만 나오게 한다.
		 * (나누기 계산 - "정수 자료형" / 실수값으로 나오게 한다. - "실수 자료형" / 소수점 4번째~ - "출력 형식 (서식))
		 */
		
		//Scanner sc = new Scanner(System.in);
	
		//System.out.println("첫 번째 값 입력 : ");
		//int num1 = sc.nextInt();
		
		//System.out.println("두 번째 값 입력 : ");
		//int num2 = sc.nextInt();
		
		//System.out.printf("더하기 계산 결과 : %d + %d = %d\n", num1, num2, num1 + num2);
		//System.out.printf("빼기 계산 결과 : %d - %d = %d\n", num1, num2, num1 - num2);
		//System.out.printf("나누기 계산 결과 : %d / %d = %f.4\n", num1, num2, num1 / num2);		// 오류 발
		//System.out.printf("나머지 계산 결과 : %d % %d = %d\n", num1, num2, num1 % num2);

		// 풀이
		// 1. Scanner 사용 필요
		// 2. 
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, r1, r2, r3, r5;
		double r4;
		
		System.out.print("첫 번째 값 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 값 입력 : ");
		n2 = sc.nextInt();
		
		r1 = n1 + n2;
		r2 = n1 - n2;
		r3 = n1 * n2;
		r4 = (double)n1 / n2;
		r5 = n1 % n2;
		
		System.out.println("더하기 계산 결과 : " + r1);
		System.out.println("빼기 계산 결과 : " + r2);
		System.out.println("곱하기 계산 결과 : " + r3);
		System.out.printf("나누기 계산 결과 : %.4f\n", r4);
		System.out.println("나머지 계산 결과 : " + r5);
	}

}
