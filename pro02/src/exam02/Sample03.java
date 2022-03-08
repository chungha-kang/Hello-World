package exam02;

public class Sample03 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 이스케이프 문자
		 * 		- 문자열에 작성하는 문자들 중 일부 문자에 대해 다른 기능을 부여하기 위해 사용
		 * 		- \n(개행), \r(커서를 앞으로 옮겨줌), \t(탭공백), \', \"(따옴표가 중복으로 쓰일 때), \\(역슬래시 문자가 필요 할 때) 등의 이스케이프 문자가 있음.
		 * 		  (\r : 리눅스 운영체제에서 Console(Terminal) 작업으로 프로그램 다운로드 받을 때 "진행 프로그레스 바"와 같은 출력 형태가 필요한 때)
		 */
		
		System.out.println("안녕 하세요.\r\n");
		System.out.println("이클립스\r자바\n");	// 자바립스
		
		//System.out.println(""진행 프로그레스 바" 와 같은 출력 형태가 필요 한 때);
		System.out.println("\"진행 프로그레스 바\" 와 같은 출력 형태가 필요 한 때");
		
		System.out.print("다운로드 중...[  0%]\r");
		System.out.print("다운로드 중...[ 10%]\r");
		System.out.print("다운로드 중...[ 20%]\r");
		System.out.print("다운로드 중...[ 30%]\r");
		System.out.print("다운로드 중...[ 40%]\r");
		System.out.print("다운로드 중...[ 50%]\r");
		System.out.print("다운로드 중...[ 60%]\r");
		System.out.print("다운로드 중...[ 70%]\r");
		System.out.print("다운로드 중...[ 80%]\r");
		System.out.print("다운로드 중...[ 90%]\r");
		System.out.print("다운로드 중...[100%]\r");
		
		System.out.print("다운로드 중...[  0%]\r");
		Thread.sleep(1000);		// 1초 동안 일시정지
		System.out.print("다운로드 중...[ 10%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 20%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 30%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 40%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 50%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 60%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 70%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 80%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[ 90%]\r");
		Thread.sleep(1000);
		System.out.print("다운로드 중...[100%]\r");
	}

}