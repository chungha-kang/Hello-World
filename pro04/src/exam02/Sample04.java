package exam02;

import java.util.Random;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * 1 ~ 16 까지의 정수를 4x4 배열에 순차적으로 저장하고 표 형식으로 출력하시오.
		 */
		
		// 내풀이
		/*
		int[][] arr1 = new int[][] {{1, 2, 3, 4}, {1, 2, 3, 4}};
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 1; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.print("\n");
		}		
		*/
		
		// 강사님 풀이
		int[][] arr1 = new int[4][4];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 1; j < arr1.length; j++) {
				arr1[i][j] = num++;
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.print("\n");
		}
				
		
		/*
		 * 1 ~ 49 사이의 임의의 정수를 5x6 배열에 순차적으로 저장하고 표 형식으로 출력하시오.
		 */
		
		// 내 풀이
		/*
		int[][] arr2 = new int[5][6];
		
		for(int i = 0; ;) {
			
		}
		System.out.print("\n");
		*/
		
		// 강사님 풀이
		Random rand = new Random();
		int[][] arr2 = new int[5][6];
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = rand.nextInt(49) + 1;
			}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("--------------");
		
		
		/*
		 * 1 ~ 49 사이의 임의의 정수를 5xN 배열에 순차적으로 저장하고 표 형식으로 출력하시오.
		 * (N의 경우 3 ~ 6 사이의 임의의 크기로 만들어 저장되도록 한다. <- 가변 길이 2차 배열)
		 */
		
		// 내풀이
		/*
		int[][] arr3 = new int[5][N];
				
		for(int i = 0; ;) {
			for(int j = 0;;) {
				System.out.print(arr1[i][j] + "\t");
			}
		}
		System.out.print("\n");
		 */
		
		
		// 강사님 풀이
		int[][] arr3 = new int[5][];
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = new int[rand.nextInt(4) + 3];
			
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = rand.nextInt(49) + 1;
			}
		}
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.print("\n");
		}
		}
	}
}

