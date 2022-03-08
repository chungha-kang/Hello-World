package exam02;

public class Sample02 {
	
	public static void main(String[] args) {
		/*
		 * format 활용
		 */
		
		// 정렬(오른쪽 또는 왼쪽) (**가운데 정렬 없음**)
		System.out.printf("%5s | %5s\n", "name", "age");	// 10s = 열글자, 5s = 5글자의 자릿수 안에서 출력해라
		System.out.printf("%5s | %5d\n", "Hong", 32);
		System.out.printf("%5s | %5d\n", "Kim", 27);
		System.out.printf("%5s | %5d\n", "Park", 29);
		
		System.out.println("----------------");
		
		System.out.printf("%-5s | %-5s\n", "name", "age");
		System.out.printf("%-5s | %-5d\n", "Hong", 32);
		System.out.printf("%-5s | %-5d\n", "Kim", 27);
		System.out.printf("%-5s | %-5d\n", "Park", 29);
		
		System.out.println("----------------");
		
		System.out.printf("%-5s | %-5s\n", "name", "age");
		System.out.printf("%-5s | %-5.1f\n", "Hong", 32.0);
		System.out.printf("%-5s | %-5.1f\n", "Kim", 27.1);		// -5 = 소수점 자릿수 포함, (2, 9, ., 1, 여유공간)
		System.out.printf("%-5s | %-5.3f\n", "Park", 29.1);	// 이렇게 하면 정렬의 의미가 없어짐, 틀어져서 나옴
		
		System.out.println("----------------");
		
		// 한글을 사용할 때 문제점
		// 한글은 2자리 차지 ('이름' -> 4자리 차지) ('홍길동' -> 6자리 차지)
		System.out.printf("%5s | %5s\n", "이름", "나이");
		System.out.printf("%5s | %5d\n", "홍길동", 32);
		System.out.printf("%5s | %5d\n", "김건", 27);
		System.out.printf("%5s | %5d\n", "박지우", 29);
		// 해결 방법 -> 자릿수를 크게 맞춰주면 된다. 5-> 6
	}

}
