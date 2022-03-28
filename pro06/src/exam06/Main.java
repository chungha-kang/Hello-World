package exam06;

public class Main {

	public static void main(String[] args) {
		// 내 풀이
//		Grade g1 = new Grade("Math");
//		System.out.println(g1.getName());
//
//		Grade g2 = new Grade("English");
//		System.out.println(g1.getName());
//
//		Grade g3 = new Grade("Korean");
//		System.out.println(g1.getName());
//		
//		Grade[] gArr = new Grade[3];
//		gArr[0] = new Grade("Math");
//		gArr[1] = new Grade("English");
//		gArr[2] = new Grade("Korean");
//		
//		for(int i = 0; i < gArr.length; i++) {
//			System.out.println("gArr[" + i + "] -> " + gArr[i].getName());
//		}
//		System.out.print("\n");
//		
//		GradeList gList = new GradeList(gArr);
//		
//		gList.add("Science");
//		
//		for(int i = 0; i < gList.length(); i++) {		// 여기서 gList가 아니라 gArr.length 라고 되어 있으면 리스트명이 추가가 안됨, **그럼 리스트에 add 한 것은 배열에 저장 된 것은 아닌건가?**
//			Grade data = gList.get(i);
//			System.out.println(data.getName());
//		}
//		System.out.print("\n");
//		
//		gList.update("English", "Spanish");
//		gList.update(3, "Social");
//		
//		for(int i = 0; i < gList.length(); i++) {	
//			Grade data = gList.get(i);
//			System.out.println(data.getName());
//		}
//		System.out.print("\n");
//		
//		gList.remove("Social");
//		gList.remove(1);
//		
//		for(int i = 0; i < gList.length(); i++) {	
//			Grade data = gList.get(i);
//			System.out.println(data.getName());	
//		}
//	}
//
//}

		GradeList gList1 = new GradeList();
		GradeList gList2 = new GradeList(5);
		
		GradeList gList3 = new GradeList("국어", "영어", "수학", "과학");
		for(int i = 0; i < gList3.length(); i++) {
			System.out.println(gList3.getName(i) + ":" + gList3.getScore(i));
		}
		
		System.out.println("======================");
		
		Grade[] gArr = new Grade[2];
		gArr[0] = new Grade("과학");
		gArr[1] = new Grade("영어");
		
		GradeList gList4 = new GradeList(gArr);
		gArr[0].setName("국어");
		gList4.get(1).setName("수학");
		gList4.add("역사");
		gList4.add("영어", 89.4);
		gList4.add(new Grade("과학", 78.8));
		
		for(int i = 0; i < gList4.length(); i++) {
			System.out.println(gList4.getName(i) + ":" + gList4.getScore(i));
		}
			
		
//		GradeList gList = new GradeList("국어", "영어");
		
//		GradeList gList = new GradeList("국어", "영어", "수학");		// 오버로딩, 오버로드 하는것.
		
//		Grade[] gArr = new Grade[2];
//		GradeList gList = new GradeList(gArr);
		
		
		
	}
}