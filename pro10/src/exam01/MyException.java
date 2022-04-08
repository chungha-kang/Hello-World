package exam01;

public class MyException {

	public void exceptionTrhows() throws Exception {
		// 현재 메서드를 실행한 위치로 발생된 에러를 던지는(throws) 메서드
		exceptionRun();
	}
	
	public void exceptionNonThrows() {
		// 현재 메서드에서 발생된 에러를 처리하는(try ... catch) 메서드
		try {
			exceptionRun();
		} catch(Exception e) {
			System.out.println("Exception 을 처리하였습니다.");
		}
	}

	private void exceptionRun() throws fileNotException {
		// 에러를 발생 시키기 위한 메서드
		System.out.println("에러 발생!");
		throw new UserDefineException();
	}
}
