package exam03;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 지역 변수 사용할 때 주의사항
		 * 		지역 변수 사용할 때에는 반드시 초기화가 되어 있어야 한다.
		 */
		int i1;	// 선언만 한 상태
		i1= 1;  // 초기화를 시켜주면 에러가 나오지 않는다.
		
		System.out.println(i1);
		
		/*
		 *  상수 : 변하지 않는 값을 의미한다.
		 *  자바 프로그램에서는 한 번 초기화 한 후에는 변경되지 않는 것을 의미
		 */
		final int number;	// final = 최종값이라는 뜻
		number = 2;
		
		/*
		 * 변수명 명명 규칙
		 * 		1. 한글 사용 x
		 * 		2. 영문자는 대소문자 구분하여 사용해야 함.
		 * 		3. 띄어쓰기 금지, 대신 _(언더바) 사용
		 * 		4. 숫자는 영문자 뒤에 작성
		 *		5. 예약어 사용하면 안됨.
		 *		6. 자바에서는 $ 특수문자도 사용할 수 있다.
		 *
		 *		권고 사항
		 *			상수명을 작명할 때 반드시 대문자로만 작명할 것.
		 */
		int i = 1;
		int I = 2;
		
		System.out.println(I);	// i = 1, I = 2
		
		
		String str1 = "Train" + 123 + 45 + "Departure";
		String str2 = 123 + 45 + "Train" + "Departure";
		String str3 = "Train" + "Departure" + 123 + 45;
		String str4 = "Train" + "Departure" + (123 + 45);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
