package exam08;

import java.util.Random;

public class MethodSample {

	public void method01() {
		System.out.println("반환 타입은 void 이고 매개변수가 없는 메서드");
	}
	
	public int method02() {
		System.out.println("반환 타입은 int(기본자료형) 이고 메개변수가 없는 메서드");
		return 0;
	}
	
	public int[] method03() {
		int[] res = new int[5];
		System.out.println("반환 타입은 int[](배열) 이고 메개변수가 없는 메서드");
		//return new int[5];		// 위에 선언 안해줬을 때
		return res;
	}
	
	public String method04() {
		String res = new String();
		System.out.println("반환 타입은 String(클래스/객체) 이고 메개변수가 없는 메서드");
		//return null;		// 위에 선언 안해줬을 때
		return res;
	}
	
	public void method05(int[] arr) {
	//public int[] method05(int[] arr) {
		//arr = arr.clone();
		System.out.println("반환 타입은 String(클래스/객체) 이고 메개변수가 없는 메서드");
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] -> " + arr[i]);
		}
		//arr[0] = 10;	arr[1] = 20;	arr[2] = 30;
		//return arr;
	}
	
	public int[] method06(Random r) {
		System.out.println("반환 타입은 void 이고 매개변수가 클래스(객체)인 메서드");
		int x1 = r.nextInt(10);
		int x2 = r.nextInt(10);
		//r.nextInt(10);
		return new int[] {x1, x2};		// 반환값은 무조건 1개임. 즉, 2개 이상 일 경우 배열로 만들어준다.
	}
	
	public void method07(int ... nums) {
		System.out.println("반환 타입은 void 이고 매개변수가 가변인자인 메서드");
		System.out.println(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] -> " + nums[i]);
		}
	}
}
