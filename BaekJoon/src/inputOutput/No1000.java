package inputOutput;

import java.util.Scanner;

public class No1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수 A와 B를 입력받은 다음, A+B를 출력합니다.");
		System.out.print("A값을 입력하세오(A는 0보다 크다) : ");
		int A = sc.nextInt();
		
		System.out.print("B값을 입력하세요(B는 10보다 작다) : ");
		int B = sc.nextInt();
		
		int result = A + B;
		System.out.printf("A+B= %d", result);
				
	}

}

/* 제출용
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A + B);
	}
}
*/
