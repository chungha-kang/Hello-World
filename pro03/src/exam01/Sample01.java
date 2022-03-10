package exam01;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * 		- 프로그램 코드의 실행을 제어하기 위한 제어문 중 하나이다.
		 * 		- 조건에 따라 코드를 실행하거나 실행하지 않게 제어를 한다.
		 * 		- 조건문의 종류는 if, if ... else, if ... else if, switch 가 있다.
		 */
		
		/*
		 * if 문
		 * 		if(조건식) {
		 * 			조건식의 결과가 참일 때 실행할 코드를 여기에 작성한다.
		 * 		}
		 */
		int num = 11;
		
		if(num > 10) {
			System.out.println("num 변수에 저장된 값은 10 보다 큽니다.");
		}
		
		/*
		 * if ... esle 문
		 * 		기존 if 문에서 생략된 else 를 사용한 문이다.
		 * 		조건식의 결과가 거짓일 때 수행할 코드가 있는 경우 사용하면 된다.
		 * 
		 * 		if(조건식) {
		 * 			조건식의 결과가 참일 때 실행할 코드를 여기에 작성한다.
		 * 		} else {
		 * 			조건식의 결과가 거짓일 때 실행할 코드를 여기에 작성한다.
		 * 		}
		 */
		if (num % 2 == 0) {
			System.out.println("num 변수에 저장된 값은 짝수 입니다.");
		} else {
			System.out.println("num 변수에 저장된 값은 홀수 입니다.");
		}
		
		/*
		 * if ... else if 문
		 * 		if 문에서 검사해야하는 조건이 여러개 존재하는 경우 사용하면 된다.
		 * 		else if 를 원하는 만큼 반복해서 사용하 수 있으며, 마지막에는 else 를 생략하거나 정의하면 된다.
		 * 
		 * 		if(조건식1) {
		 * 			조건식1의 결과가 참일 때 실행할 코드를 여기에 작성한다.
		 * 		} else if(조건식1) {
		 * 			조건식1의 결과가 거짓이고 대신 조건식2의 결과차 참일 때 실행할 코드를 여기에 작성한다.
		 * 		} else if(조건식2) {
		 * 			조건식2의 결과가 거짓이고 대신 조건식3의 결과차 참일 때 실행할 코드를 여기에 작성한다.
		 * 		} ... {
		 * 			조건식3의 결과가 거짓이고 대신 생략된 문장안의 조건식의 결과차 참일 때 실행할 코드를 여기에 작성한다.
		 * 		} else {
		 * 			모든 조건식의 결과가 거짓일 때 실행할 코드를 여기에 작성한다.
		 * 		}
		 */
		
		num = 0;
		
		if(num <= 19) {
			System.out.println("미성년자 입니다.");
		} else if(num <= 29) {
			System.out.println("20대 입니다.");
		} else if(num <= 39) {
			System.out.println("30대 입니다.");
		} else if(num <= 49) {
			System.out.println("40대 입니다.");
		} else if(num <= 59) {
			System.out.println("50대 입니다.");
		} else {
			System.out.println("국민연금을 수령할 나이대 입니다.");
		}
		
		/*
		 * 중첩 if 문
		 * 		- 문장 안에 또 다른 문장이 중첩되어 작성되는 형태.
		 *		= 중첩은 원하는 만큼 반복하여 중첩 시킬 수 있다. 
		 * 
		 * 		if(조건식1) {
		 * 			if(조건식2) {
		 * 				...
		 * 			}
		 * 		} else {
		 * 			if(조건식3) {
		 * 				...
		 * 			}
		 * 		} 
		 */
		
		num = 0;
		
		if(num <= 19) {
			if(num >= 13 && num <= 18) {
				System.out.println("미성년자 입니다.(중학생 입니다.)");
			} else if(num >= 16 && num <= 18) {
				System.out.println("미성년자 입니다.(고등학생 입니다.)");
			} else if(num == 19) {
				System.out.println("미성년자 입니다.(고등학교 졸업생 입니다.)");
			} else {
				System.out.println("미성년자 입니다.(유아/초등학생 입니다.)");
			}
		} else if(num <= 29) {
			System.out.println("20대 입니다.");
		} else if(num <= 39) {
			System.out.println("30대 입니다.");
		} else if(num <= 49) {
			System.out.println("40대 입니다.");
		} else if(num <= 59) {
			System.out.println("50대 입니다.");
		} else {
			System.out.println("국민연금을 수령할 나이대 입니다.");
		}

				
		}

	}
