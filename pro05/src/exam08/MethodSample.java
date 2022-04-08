package exam08;

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
		System.out.println("반환 타입은 String(클래스/객체) 이고 메개변수가 없는 메서드");
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] -> " + arr[i]);
		}
	}
}
