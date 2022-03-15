package exam02;

import java.util.Scanner;
import java.util.Random;

public class Sample12 {

	public static void main(String[] args) {
		// 강사님 풀이
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String name, player, sCom = "";
		String[] data = {"가위", "바위", "보"};
		int[][] arrResult = new int[][] {
			{1, 0, 2},
			{2, 1, 0},
			{0, 2, 1}
		};
		int computer;
		int result = 0;		// Win 1, Lose -1, Draw 0
		int[] record = new int[3];
		
		System.out.print("당신의 이름을 입력하시오 : ");
		name = sc.nextLine();
		
		for(;;) {
			System.out.print("가위 바위 보 입력 : ");
			player = sc.nextLine();
			computer = random.nextInt(3);
			
			sCom = data[computer];
			
			if(player.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", record[0] + record[1] + record[2]
						, record[2], record[1], record[0]);
				break;
			} else if(player.equals("가위") || player.equals("바위") || player.equals("보")) {
				for(int i = 0; i < data.length; i++) {
					if(data[i].equals(player)) {
						ply = i;
						break;
					}
				}
		}
	}
	}
	}
