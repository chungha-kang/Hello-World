package exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		/*
		 * 사용자로 부터 임의의 정수 값을 입력 받고 입력받은 모든 정수의 합과 평균을 구하는
		 * 코드를 작성한다. (동적 배열 활용, Sample08 내용 변경)
		 * 
		 * -1 입력이 들어오면 종료라고 판별한다.
		 * 
		 * 예제
		 * 		총 입력 횟수 : 5
		 * 		1 번째 정수값 입력 : 7
		 * 		2 번째 정수갑 입력 : 12
		 * 		3 번째 정수값 입력 : 24
		 * 
		 *		총 합 : 43
		 *		평 균 : 14.3
		 */
		Scanner sc = new Scanner(System.in);
		int cnt = 1, tot = 0;
		int[] arr1 = new int[0];
		
		while(true) {
			System.out.printf("%d 번째 정수값 입력 :", cnt);

			int num; 
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				sc.nextLine();
			} else {	
			if(sc.nextLine().equals("exit")) {
				break;
			} else {
				System.out.println("정수 값 또는 exit 를 입력하세요.");
				continue;
			}
		}	
		int[] temp = Arrays.copyOf(arr1,  arr1.length + 1);
		arr1 = temp;
		
		arr1[cnt - 1] = num;
		cnt += 1;
		
		System.out.println(Arrays.toString(arr1));
	}
		
	for(int i = 0; i < arr1.length; i++) {
		tot += arr1[i];
	}
		
		System.out.println("총 합 : " + tot);
		System.out.println("평 균 : " + avg);
	}

}
