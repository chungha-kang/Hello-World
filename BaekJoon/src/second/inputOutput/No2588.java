package second.inputOutput;

import java.util.Scanner;

public class No2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		int value2 = sc.nextInt();

		sc.close();
		
		System.out.println(value * (value2%10));
		System.out.println(value * (value2%100/10));
		System.out.println(value * (value2/100));
		System.out.println(value * value2);
	}
	
}