package exam07_Teacher;

public class Employee {
	private String name;
	private int age;
	private char gender;
	private int salary = 2500;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void payMonth() {
		System.out.println(getSalary());	
	}
	}

