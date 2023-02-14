package second.inputOutput;

import java.util.Scanner;

public class No3003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = 1;
		int Q = 1;
		int L = 2;
		int B = 2;
		int N = 2;
		int P = 8;
		
		K = K - sc.nextInt();
		Q = Q - sc.nextInt();
		L = L - sc.nextInt();
		B = B - sc.nextInt();
		N = N - sc.nextInt();
		P = P - sc.nextInt();
		
		System.out.print(K + " ");
		System.out.print(Q + " ");
		System.out.print(L + " ");
		System.out.print(B + " ");
		System.out.print(N + " ");
		System.out.print(P + " ");
		sc.close();
	}
	
}