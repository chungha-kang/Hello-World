package exam02;

import java.util.Scanner;

public class Sample06 {

	public static void main(String[] args) {
		/*
		 * 1 ~ 10 까지의 누적합을 구하시오.
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		 */
		// 내 풀이
		int total= 0;
		for(int i = 1; i <= 10; i++) {
			total = total + i;
		}
		System.out.println("1 ~ 10 누적합 : " + total);
		
		
		
		// 강사님 풀이
		int tot = 0;
		for(int i = 1; i <= 10; i++) {
			tot += i;		// tot = tot + i;
		}
		System.out.println("1 ~ 10 까지의 누적합 -> " + tot);
		
		/*
		 * 사용자가 입력한 정수값에 해당하는 구구단을 출력하시오.
		 */
		
		// 내풀이
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값을 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
		*/
		
		// 강사님 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
		System.out.println("");
		
		/*
		 * 구구단을 출력할 때 한 줄에 3개의 결과가 출력되도록 하시오.
		 */
		int cnt = 0;
		for(int i =1; i<= 9; i++) {
			System.out.printf("%d x %d = %d\t", num, i, num * i);
			cnt++;
			if(cnt == 3) {
				System.out.print("\n");
				cnt = 0;
			}
		}
	}

}
