package exam01;

import java.util.Arrays;

public class Sample07 {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용하여 깊은 복사 작업을 자바에서 제공하는 기능으로 바꾸어서 작업
		 */
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		
		// 반복문을 사용한 깊은 복사
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// 자바의 기본 기능을 사용한 깊은 복사
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 1, arr3, 0, arr1.length - 1);
		// arr1,0 -> arr1[i]	arr3,0 -> arr2[i]	arr1.length -> arr1.length
		
		//arr1[0] = 10;
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> %d, arr3[%d] -> %d\n", i, arr1[i], i, arr3[i]);
		}
		
		// Arrays 객체를 사용한 깊은 복사 (arr1의 내용을 길이를 다르게 복사하고 싶을 때)
		int[] arr4 = Arrays.copyOf(arr1, arr1.length + 1);
		arr1[0] = 20;
		System.out.printf("arr1[0] -> %d, arr4[0] -> %d\n", arr1[0], arr4[0]);
		System.out.printf("arr4.length -> %d\n", arr4.length);
		
		// .clone() 을 사용한 깊은 복사 (arr1의 내용을 길이도 동일하게 복사하고 싶을 때)
		int[] arr5 = arr1.clone();
		
		arr1[0] = 30;
		System.out.printf("arr1[0] -> %d, arr5[0] -> %d\n", arr1[0], arr5[0]);
	}

}
