package exam06;

import java.util.Objects;

// 일반 고객
public class Customer {
	// 이름, 나이, 성별
	private String name;
	private int age;
	private char gender;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void buy(String ProductName, int price) {
		System.out.printf("%s 상품을 %,d 원에 구입하였습니다.\n", ProductName, price);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
