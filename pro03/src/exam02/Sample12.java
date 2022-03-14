package exam02;

import java.util.Scanner;
import java.util.Random;

public class Sample12 {

	public static void main(String[] args) {
		// 내 풀이
		
		
		
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
