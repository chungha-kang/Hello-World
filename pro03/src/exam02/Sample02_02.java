package exam02;

public class Sample02_02 {

	public static void main(String[] args) {
		// 1 ~ 99 까지 반복문을 사용하여 반복출력 하시오. (단, 초기값 설정은 i = 1 로 한다.)
		
		// 1 ~ 99 까지 반복문을 사용하여 반복출력 하시오. (단, 초기값 설정은 i = 0 으로 한다.)
		
		// 1 ~ 99 까지 반복문을 사용하여 반복출력 하시오. (단, 짝수에 해당하는 값만 출력하시오.)
		
		// 내 풀이
		/*
		for(int i = 1; i < 100; i++) {
			System.out.printf("%d\n", i);
		}
		System.out.println();
			
		for(int i = 0; i < 100; i++) {
			System.out.printf("%d\n", i);
		}
		System.out.println();
			
		for(int i = 1; i < 100; i % 2 == 0) {		//에러 
			System.out.printf("%d\n", i);		
		}
		*/ 
		
		
		//강사님 풀이
		for(int i = 1; i < 100; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = 0; i < 99; i++) {
			System.out.println(i + 1);		// System.out.printf("%d + 1\n", i); 안됨
		}
		System.out.println();
		
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}	
		System.out.println();
		//또는
		for(int i = 2; i < 100; i+=2) {
			System.out.println(i);	
		}
	}
}
