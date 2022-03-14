package exam02;

import java.util.Scanner;
import java.util.Random;

public class Sample12 {

	public static void main(String[] args) {
		// 내 풀이
		
		
		// 배열을 적용한다.
		//		- 컴퓨터가 생선한 정수 값을 가위, 바위, 보로 치환하기 위한 배열
		//		- 전적 기록을 배열을 사용하여 관리할 수 있도록 한다.
		
		// 강사님 풀이
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String name, player, sCom = "";
		int computer;
		int result = 0;		// Win 1, Lose -1, Draw 0
		int wCnt = 0, dCnt = 0, lCnt = 0;
		
		System.out.print("당신의 이름을 입력하시오 : ");
		name = sc.nextLine();
		
		for(;;) {
			System.out.print("가위 바위 보 입력 : ");
			player = sc.nextLine();
			computer = random.nextLine();
			
			if(computer == 0) {
				
			}
		}
		

	}

}
