package exam01;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 배열의 크기가 10인 배열을 선언하고 10 ~ 1 까지의 값으로
		 * 초기화 하도록 한다.
		 */
		
		/*
		// 내 풀이
		int[] arr1;
		arr1 = new int[10];
		arr1[0] = 10;	arr1[1] = 9;	arr1[2] = 8;
		arr1[3] = 7;	arr1[4] = 6;	arr1[5] = 5;
		arr1[6] = 4;	arr1[7] = 3;	arr1[8] = 2;
		arr1[9] = 1;
		
		for(int i = 1; i < 11; i++) {
			System.out.println(arr1[i] + "\t");
		}
		*/
		
		// 강사님 풀이
		int[] arr1 = new int[10];
		int init = 10;
		
		for(int i = 0; i < 10; i++) {
			arr1[i] = init--;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.print("\n");
		
		/*
		 * 배열의 크기가 10인 배열을 선언하고 2 부터 시작하여 짝수값에 해당하는
		 * 값으로 초기화 하도록 한다.
		 */
		int[] arr2;
		arr2 = new int[10];
		init = 2;
		
		for(int i = 0; i < 10; i++) {
			arr2[i] = init;
			init += 2;
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.print("\n");
		
		
		/*
		 * 배열의 크기가 5인 실수 배열을 선언하고 1 부터 0.5 씩 증가된 값으로
		 * 초기화 하도록 한다.
		 */
		double[] arr3 = new double[5];
		double init2 = 1.0;
		
		for(int i = 0; i < 5; i++) {
			arr3[i] = init2;
			init2 += 0.5;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr3[i] + "\t");
		}
		
		/*
		 * 배열의 크기가 5인 문자 배열을 선언하고 'A' ~ 'E' 까지의 문자값으로
		 * 초기화 하도록 한다.
		 */
		char[] arr4 = new char[5];
		
		for(int i = 0; i < 5; i++) {
			arr4[i] = (char)('A' + i);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(arr4[i] + "\t");
		}
		System.out.print("\n");
	}

}
