package exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	@Override
	public int compareTo(Person o) {
		if(this.getName().compareTo(o.getName()) > 0) {
			return 1;
		} else if(this.getName().compareTo(o.getName()) < 0) {
			return -1;
		} else {
			if(this.getAge() > o.getAge()) {
				return -1;
			} else if(this.getAge() < o.getAge()) {
				return 1;
			}
		}
		return 0;
	}
}


public class Sample01 {

	public static void main(String[] args) {
		/*
		 * List 계열 컬랙션 = ArrayList
		 */
		List<Integer> aList = new ArrayList<Integer>();		// E = 제네릭타입 (기본 타입x 무조건 객체)(int x Integer O)
		aList.add(100); aList.add(200); aList.add(300);
		System.out.println(aList);
		
		// 배열값 추가(저장)
		aList.add(2, 400);
		System.out.println(aList);
		
		List<Integer> bList = new ArrayList<Integer>();
		bList.add(500); bList.add(600); bList.add(700);
		 
		aList.addAll(bList);
		System.out.println(aList);
		
		// 배열값 변경(수정)
		Integer i1 = aList.set(2, 350);
		System.out.println(i1 + " / " + aList);
		i1 = aList.set(3, 450);
		System.out.println(i1 + " / " + aList);
		
		boolean result1 = aList.contains(Integer.valueOf(350));
		System.out.println(result1);
		
		int result2 = aList.indexOf(Integer.valueOf(350));
		System.out.println(result2);
		
		System.out.println(aList.get(0));
		System.out.println(aList.get(1));
		System.out.println(aList.get(2));
		
		System.out.println(aList.size());
		
		for(int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i));
		}
		
		result1 = aList.isEmpty();
		System.out.println(result1);
		
		bList.clear();
		result1 = bList.isEmpty();
		System.out.println(result1);
		
		Integer i = aList.remove(0);		// "pop" : 삭제 된 값을 반환 하는것 
		System.out.println(i + " / " + aList);
		
		System.out.println("<<<<< Iterator 사용 >>>>>");
		Iterator<Integer> iter = aList.iterator();
		while(iter.hasNext()) {
			Integer i2 = iter.next();
			System.out.println(i2);
		}
		
		System.out.println("<<<<< for each 문 >>>>>");
		for(Integer i3: aList) {
			System.out.println(i3);
		}

		System.out.println("리버스 전 : " + aList);
		Collections.reverse(aList);		
		System.out.println("리버스 후 : " + aList);
		
		System.out.println("오름차순 정렬 전 : " + aList);
		Collections.sort(aList);		
		System.out.println("오름차순 정렬 후 : " + aList);
		
		// 내림차순으로 정렬하기 위해서는 오름차순 후 리버스 하는 것이 편하지만 아래의 방식도 있음.
		Collections.sort(aList, new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i1, Integer i2) {
				if(i1 > i2) {
					return -1;
				} else if(i1 == i2) {
					return 0;
				}
				return 1;
			}
			
		});
		System.out.println("내림차순 정렬 후 : " + aList);
		
		List<Person> pList = new ArrayList<Person>();
		pList.add(new Person("홍길동", 23));
		pList.add(new Person("김철수", 25));
		pList.add(new Person("김철수", 21));
		
		Person p1 = pList.get(0);
		Person p2 = pList.get(1);
		Person p3 = pList.get(2);
		
		System.out.println(p1.getName().compareTo(p2.getName()));
		System.out.println(p2.getName().compareTo(p1.getName()));
		System.out.println(p2.getName().compareTo(p3.getName()));
		
		Collections.sort(pList, new Comparator<Person>() {		// 람다식
			
			@Override
			public int compare(Person p1, Person p2) {
				if(p1.getName().compareTo(p2.getName()) > 0) {
					return 1;
				} else if(p1.getName().compareTo(p2.getName()) < 0) {
					return -1;
				} else {
					if(p1.getAge() > p2.getAge()) {
						return 1;
					} else if(p1.getAge() < p2.getAge()) {
						return -1;
					}
				}
				return 0;
			}
			
		});
		
		for(Person p: pList) {
			System.out.println(p.getName() + " | " + p.getAge());
		}
		
		
		System.out.println("-------------");
		Collections.sort(pList);
		for(Person p: pList) {
			System.out.println(p.getName() + " | " + p.getAge());
		}
	}
}
