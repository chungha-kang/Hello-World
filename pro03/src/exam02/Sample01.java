package exam02;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * 		- 프로그램 코드의 실행을 제어하기 위해 사용하는 문법
		 * 		- 반복문은 for, while, do ... while 이 있다.
		 * 		- 반복문은 0 ~ 무한 반복 까지 자유롭게 설정할 수 있다.
		 * 		- 무한방복의 경우 프로그램의 실행이 무한번 동작하기 때문에 CPU에 부담을 줄 수 있다.(주의 할 것.)
		 *		  만약 이클립스에서 원치 않는 무한반복이 동작한 경우 프로그램을 강제 종료하면 된다. 
		 *		  (Console 창에 맨 왼쪽 빨간 네모 Terminate 클릭) (Display Selected Console 누르면 실행 중 콘솔이 나온다.)
		 */
		
		/*
		 * for 문 형식
		 * 		for(초기식; 조건식; 증감식) {
		 * 			반복 실행할 코드는 여기에 작성
		 * 		}
		 * 
		 * 초기식 : 반복문에 반복 횟수를 정할 때 초기에 사용할 값을 설정하기 위해 사용 한다.
		 * 		  생략 가능하며, 반복문 외부에 미리 초기값을 설정해서 사용하기도 한다.
		 * 조건식 : 반복문 수행 여부의 조건을 설정하기 위해 사용한다.
		 * 		  조건식의 내용에 따라 반복 횟수가 달라진다. 또한 잘못된 조건식 설정으로 무한반복이 될 수 있다.
		 * 		  생략 가능하며, 단 생략을 하면 조건이 항상 참이 되어 무한 반복 되며, 이를 제어하기 위해 반복문
		 * 		  내부에 별도의 if 조건문과 break 를 작성하여 종료 조건을 반드시 생성해야 한다.
		 * 증감식 : 값의 증감을 통해 반복문의 조건식의 조건을 맞추어 주기 위해 사용한다.
		 * 		  주로 ++, -- 증감연산을 사용한다. 단 증감값이 2 이상이 필요한 경우 복합할당 연산을 활용한다.
		 * 		  생략 가능하며, 단 생략을 하면 종료 조건에 맞는 값을 설정할 수 없어 무한반복이 될 수 있다.
		 * 		  내부에 별도의 증감식을 반드시 작성해야 한다.
		 */

		for(int i = 0; i < 5; i++) {
			System.out.printf("%d 번째 반복!!!\n", i);
		}
		System.out.println();
		
		// 초기식 생략
		int i = 0;
		for(; i < 5 ; i++) {
			System.out.printf("%d 번째 반복!!!\n", i);
		}
		System.out.println();
		
		// 조건식 생략
		for(i = 0;; i++) {								// 1. for -> 2. i -> 3. i++ -> 4. syso
			System.out.printf("%d 번째 반복!!!\n", i);		// 무한반복됨
			if(i >= 5) {
				break;									// 무한반복 막아줌
			}
		}
		System.out.println();
	
		// 증감식 생략
		for(i = 0; i < 5;) {
			System.out.printf("%d 번째 반복!!!\n", i);		// 무한반복
			i++;										// 무한반복 막아줌
		}
		System.out.println();
		
		// 전부 생략
		i = 0;
		for(;;) {
			System.out.printf("%d 번째 반복!!!\n", i);
			if(i >= 4) {
				break;
			}
			i++;
		}
	}
	

}