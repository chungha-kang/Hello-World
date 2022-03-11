package exam04;

public class Sample02 {

	public static void main(String[] args) {
		// 산술 연산자
		// +, -, *, /(나누기), %(나머지)
		int num1, num2;
		
		num1 = 10;	num2 = 3;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		// printf 에서 %는 서식코드로 사용되는 기호이므로 나머지 연산 기호(문자)로 사용하기 위해서는 '이스케이프' 기능 필요. => " % -> %% "
		System.out.print("\n");
		
		// 소수점 표현 하고 싶다면?
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %f\n", num1, num2, (double)num1 / num2);	// 10/3 = 3.33333 으로 소수점 까지 표현이 된다.
		System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
		System.out.print("\n");
		
		// 비교 연산자
		// ==(같다), !=(다르다), <(왼쪽 피연산자 값이 작다), >(왼쪽 피연산자 값이 크다)
		// <=(왼쪽 피연산자 값이 작거나 같다), >=(왼쪽 피연산자 값이 크거나 같다)
		// 비교 연산의 결과는 ture 또는 false 의 논리 값이다.
		
		System.out.printf("%d == %d -> %b\n", num1, num2, num1 == num2);
		System.out.printf("%d != %d -> %b\n", num1, num2, num1 != num2);
		System.out.printf("%d < %d -> %b\n", num1, num2, num1 < num2);
		System.out.printf("%d > %d -> %b\n", num1, num2, num1 > num2);
		System.out.printf("%d <= %d -> %b\n", num1, num2, num1 <= num2);
		System.out.printf("%d >= %d -> %b\n", num1, num2, num1 >= num2);
		System.out.println("d");
		
	}

}
