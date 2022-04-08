package exam08;

public class Sample01 {

	public static void main(String[] args) {
		MethodSample m = new MethodSample();
		
		m.method01();				// '호출'한다
		int r1 = m.method02();
		int[] r2 = m.method03();
		String r3 = m.method04();
		
		int[] arg1 = new int[] {1, 2, 3};
		System.out.println(arg1);
		m.method05(arg1);
	}

}
