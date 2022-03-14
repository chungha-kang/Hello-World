package exam01;

import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		/*
		 * 카이사르 암호 만들기.
		 * 		- 사용자 입력으로 영단어를 입력 받는다.
		 * 		- 입력받은 영단어는 문자 배열로 생성한다.
		 * 		- 생성된 문자 배열에 대해 암호화된 배열을 저장하기 위한 배열을 새로 만든다.
		 * 		- 문자 쉬프트는 3으로 하고 만약 'z' 문자에 대한 쉬프트가 필요한 경우 'a'로 넘어가게 해야 한다.
		 * 
		 * 출력 형식
		 * 		암호화 전 : apple
		 * 		암호화 후 : dssoh
		 */
		
		// 내 풀이
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("암호화 할 영단어를 입력하시오 : ");
		sc = sc.toString();
		
		String[] arr1 = new String[31]; {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}
		for(int)
		*/
		
		// 강사님 풀이
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영단어 입력 : ");
		String sInput = sc.nextLine();
		
		char[] origin = new char[sInput.length()];	// 메서드
		for(int i =0; i < sInput.length(); i++) {
			origin[i] = sInput.charAt(i);
		}
		
		char[] crypto = new char[origin.length];	// 배열, 길이 (속성) // new char[sInput.length()] 도 가능하지만 글자수를 맞춰주기 위해 origin 쓰는걸 추
		for(int i =0; i < crypto.length; i++) {	// length' = 문자열의 길이 만큼 사용하겠다
			if(origin[i] + 3 > 'z') {
				crypto[i] = (char)(origin[i] + 3 - 26);		// 'a' = 26
			} else {
				crypto[i] = (char)(origin[i] + 3);
			}
		}
		
		String res1 = "";
		String res2 = "";
		for(int i =0; i < origin.length; i++) {
			res1 += origin[i];
			res2 += crypto[i];
		}
		
		System.out.println("암호화 전 : " + res1);
		System.out.println("암호화 후 : " + res2);
	}

}