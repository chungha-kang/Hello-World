package exam02;

public class Sample01 {

	public static void main(String[] args) {
		System.out.print("안녕하세요.");
		System.out.print("반갑습니다.");	
		// 안녕하세요.반값습니다.
		
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다."); 
		/*
		 * 안녕하세요.
		 * 반값습니다.
		 * (한줄 내려가 있는 상태, =개행)
		 */
		
		int i = 30;
		System.out.println("당신은 현재 30대 입니다.");
		System.out.println("당신은 현재 " + i + "대 입니다.");
		System.out.printf("당신은 현재 %d대 입니다.", i);
		System.out.printf("당신은 현재 %o대 입니다.", i);		// ? 진수
		System.out.printf("당신은 현재 %x대 입니다.", i);		// 16진수
		System.out.printf("당신은 현재 %c대 입니다.", i);		// 아스키값의 30에 해당하는 값 (레코드 경계 할당)
		System.out.printf("당신은 현재 %c대 입니다.", i + 3); // 아스키값 출력값 맞춰줌 ( ! = 0 )
		
		System.out.println("당신은 현재 " + i + "대 입니다.");
		System.out.printf("당신은 현재 %d대 입니다.\n", i);
		System.out.printf("당신은 현재 %o대 입니다.\n", i);
		System.out.printf("당신은 현재 %x대 입니다.\n", i);
		System.out.printf("당신은 현재 %c대 입니다.\n", i);
		System.out.printf("당신은 현재 %c대 입니다.\n", i + 3);	// \n = 개행 (이스케이프 문자)
		
		double d1 = 1234.5678;
		double d2 = 1234.567812341235356586;
		System.out.printf("%f\n", d1);
		System.out.printf("%.10f\n", d1);		// %.2f 에서 .2 가 소수점자릿수를 나타낸다.
		System.out.printf("%e\n", d1);
		System.out.printf("%g / %g\n", d1, d2);
		System.out.printf("%g / %g\n", d1, d2);
		System.out.printf("%A\n", d1);
		
		boolean b1 = true;
		boolean b2 = false;
		int b3 = 0;
		int b4 = 1;
		int b5 = -1;
		
		System.out.printf("%b / %b\n", b1, b3);
		System.out.printf("%b / %b\n", b2, b4);
		System.out.printf("%b / %b\n", b2, null);	// null 데이터만 false로 출력된다.
		
		System.out.println(b1);
		System.out.println(b2);	
	}

}
