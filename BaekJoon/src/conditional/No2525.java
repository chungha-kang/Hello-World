package conditional;

import java.util.Scanner;

public class No2525 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int min = 60 * H + M;
		min += C;
		
		H = min / 60 % 24;
		M = min % 60;
				
		System.out.println(H + " " + M);
	}
}
