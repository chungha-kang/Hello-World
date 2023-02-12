package loop;

import java.util.Scanner;

public class No25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int t =  sc.nextInt();
        int c = sc.nextInt();

        for(int i = 0; i< c; i++){
            int p = sc.nextInt();
            int n = sc.nextInt();

            t = t - (p * n);
        }

        if(t == 0) System.out.println("Yes");
        else System.out.println("No");

    }
}