package exam01;

public class Parent {
	public int number = 1;

	public Parent() {}
	
	public Parent(int number) {
		System.out.println("자식의 setNumber 메서드 동작 시작");
		this.number = number;
		System.out.println("자식의 setNumber 메서드 동작 끝");
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
}
