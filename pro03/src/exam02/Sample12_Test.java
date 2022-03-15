package exam02;

import java.util.Scanner;
import java.util.Random;

public class Sample12_Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String Name_Input = sc.nextLine();
		
		String Computer;
		int Tcnt, Wcnt, Dcnt, Lcnt;
		
		System.out.print("가위바위보 : ");
		String RCP_Input = sc.next();
		//RCP_Input = ("가위", "바위", "보");
		
		System.out.print("Computer : ");
		System.out.println(random.nextInt(2));

		if(i = 0; i =< 2;) {
			
			System.out.println("You Win.");
			if(;;) {
				System.out.println("You Lose.");
			}
		} else if {
			System.out.println("Draw");
		} else if {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	} // exit 입력시 break;
	System.out.printf("%d전 %d승 %d무 %d패", Tcnt, Wcnt, Dcnt, Lcnt);

}
