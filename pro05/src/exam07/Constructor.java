package exam07;

public class Constructor {

	public int num1;
	
	// 기본 생성자
	// 매게변수가 있는 생성자가 없는 경우 JVM 이 자동 생성
	// 매개변수가 있는 생성자가 있는 경우 JVM 이 자동 생성하지 않음
	public Constructor() { }
	
	// 매개변수가 있는 생성자
	public Constructor(int num1) {
		// 전달 받은 매개변수 값을 이용하여 초기화
		this.num1 = num1;
	}
	
	// 오버로딩
	public Constructor(int num1, String num2) {}
	public Constructor(String num1, int num2) {}
	public Constructor(int num3, int num4) {}
	
}
