package exam03;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// 사용자가 입력한 줄 데이터를 처리하기 위한 sc.nextLine()
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("문자열을 입력하세요 : ");
		//String sInput = sc.next();
		
		//System.out.println("입력 문자열 : " + sInput);
		
		// "안녕 하세요" => 안녕
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String sInput = sc.nextLine();		// 공백을 받아줍니다. 모르겠다면 그냥 nextLine 쓰는게 속편함
		
		System.out.println("입력 문자열 : " + sInput);
		
		// "안녕 하세요" => 안녕 하세요
	}

}
