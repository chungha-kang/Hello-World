package exam01;

public class Main {

	public static void main(String[] args) {
		/*
		 * 상속
		 * 		- 클래스의 재사용성을 높여 줄수 있는 방법.
		 * 		- 클래스간에 공통 코드를 작성하여 관리하기 때문에 코드의 추가 및 변경이 용이(유지보수가 쉬워짐)
		 * 		- 코디의 중복을 제거하여 프로그램의 생산성/유지보수에 기여
		 * 
		 * 		- 부모 클래스, 자식 클래스로 나뉘어서 사용하며, 이때 자식 클래스가 부모 클래스를 상속해서 사용.
		 * 		- 부모 클래스를 상속한 자식은 부모가 가지는 멤버 변수, 멤버 메서드를 그대로 사용할 수 있다.
		 * 		- 상속을 사용할 때 자식 클래스에서 extends 키워드로 부모 클래스를 지정하여 생성한다.
		 * 
		 * 오버라이드
		 * 		- 부모의 클래스를 상속 받은 자식 클래스에서 사용할 수 있는 기능
		 * 		- 부모가 가지는 메서드를 자식에서 재정의하여 사용할 수 있게 한다.
		 * 		- 자식에 정의된 메서드를 우선 사용을 하며, 부모에 정의된 메서드를 사용하기 위해서 super 키워드 사용
		 * 		- 성립 조건
		 * 			1. 메소드 이름이 같아야 한다.
		 * 			2. 매개변수 타입, 갯수가 동일해야 한다.
		 * 			3. 리턴 타입이 동일해야 한다.
		 * 		- private 접근제한자와 final 키워드가 사용된 경우 오버라이딩 안된다.
		 */
		Child child = new Child();
		child.setNumber(5);
	}
}
