package exam03.pack1;

public class AccessTest1 {
	
	public static void main(String[] args) {
		AccessMain m1 = new AccessMain();
		System.out.println(m1.v1);
		System.out.println(m1.v2);
		System.out.println(m1.v3);
//		System.out.println(m1.v4);		// private는 해당 클래스 내부 외에는 가져올 수 없음
	}

}
