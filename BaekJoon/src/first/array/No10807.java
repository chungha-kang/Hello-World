package first.array;

import java.util.Scanner;

public class No10807 {
	
	public static void main(String args[]) {
 
		Scanner in = new Scanner(System.in);
 
		int a = in.nextInt();
		int arr[] = new int[a];
		int cnt = 0;
 
		for (int i = 0; i < a; i++) {
			arr[i] = in.nextInt();
		}
		int v = in.nextInt();
		
		
		for (int j=0; j < a; j++) {
			if(arr[j] == v)
				cnt++;
		}
		System.out.println(cnt);
	}
 
}