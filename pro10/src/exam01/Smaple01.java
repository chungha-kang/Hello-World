package exam01;

public class Smaple01 {

	public static void main(String[] args) {
		MyException m = new MyException();
//		String s = null;
//		s.length();
		//m.exceptonThrows();
		System.out.println("에러 발생 전.");
		try {
			m.exceptionThrows();
		} catch(Exception e) {
			System.out.println("에러 발생!!");
			//e.printStackTrace();
		}
		// m.exceptionNonThrows();
		System.out.println("에러 발생 후 처리 온료!");
	}

}


