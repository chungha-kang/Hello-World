package exam01;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 배열(Array)
		 * 		- 동일한 자료형의 데이터를 하나의 묶음으로 만들어 관리하기 위한 것
		 * 		- 기존 변수 공간에는 하나의 값만을 저장할 수 있었던 것에서 배열의 경우 하나 이상의 값을 지정할 수 있다.
		 * 		- 배열로 저장된 값은 인덱스(Index) 번호가 부여되어 개별 값에 접근을 할 때 활용한다.
		 * 		- 인덱스 번호는 0 번 부터 시작한다.
		 * 
		 * 배열 선언 방법
		 * 		자료형 [] 배열명;
		 * 		자료형 배열명[];
		 * 
		 * 배열에 값을 할당하는 방법
		 * 		배열명 = new 자료형[배열크기];	// 배열의 크기를 먼저 지정.
		 * 
		 * 		배열명[위치값] = 초기값;		// 배열의 크기가 지정된 후에 원하는 위치(Index)에 초기값 할당
		 * 
		 * 배열 선언 후 즉시 할당 및 초기화 하는 방법
		 * 		자료형[] 배열명 = new 자료형[] {초기값1, 초기값2, 초기값3, ...};
		 */
		int[] arr1;
		arr1 = new int[5];
		arr1[0] = 1;	arr1[1] = 2; arr1[2] = 3;
		arr1[3] = 4;	arr1[4] = 5;
		
		int[] arr2 = new int[]	{1, 2, 3, 4, 5};
		
		System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	
		/*
		 * 반복문을 사용하여 배열의 값 초기화.
		 */
		for(int i = 0; i < 5; i++) {
			arr1[i] = i + 1;
		}
		
		/*
		 * 반복문을 사용하여 배열의 값 사용
		 */
		for(int i = 0; i < 5; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.print("\n");
	}

}
