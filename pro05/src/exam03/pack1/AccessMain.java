package exam03.pack1;

public class AccessMain extends AccessParent {
	public int v1;
	protected int v2;
	int v3;
	private int v4;
	
	public void method() {
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);		// private 까지 다 가능 ( 해당 클래스 내 임)
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);		
	}
}
