package exam03;

import java.util.Arrays;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 영문자열에서 입력된 문자의 수를 구하는 코드 작성
		 * 		1. 영문자를 제외한 다른 문자는 무시한다.
		 * 		2. 영문자의 대/소문자를 구분하지 않고 문자 수를 구한다.
		 * 
		 * 예제	
		 * 		영문자 입력 : hello java programming
		 * 
		 * 		입력한 영문자 분포
		 * 		a(3), e(1), g(2), h(1), i(1),
		 * 		j(1), l(2),	m(2), n(1), o(2),
		 * 		p(1), r(2), v(1)
		 */
		
		// 강사님 풀이 (if문 활용, switch문 활용, ASCII 코드 활용 방법이 있음)
		// ASCII 코드 불러 오는 법
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c<->%d\t%c<->%d\n", i, (int)i, (char)(i + 32), (i + 32));
		}
		// 사용자 입력을 통해 문자열을 받아야 함.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		String data = sc.nextLine();
		
		// 알파벳 별 수를 세기위한 배열, 26개의 공간이 있는 배열
		int[] counting = new int[26];
		
		// 반복문을 사용하여 사용자가 입력한 문자열의 문자를 추출. -> .charAt(위치값)
		for(int i = 0; i < data.length(); i++) {
		//	System.out.println(data.charAt(i));		// 문자 입력하면 문자 하나씩 개행이 되어 나옴
			char c = data.charAt(i);

			// 대소문자를 구분하지 않기 위한 방법
			if(c >= 65 && c <= 90) {
				int idx = c - 65;
				//System.out.printf("%c<->%d->%d\n", c, (int)c, c - 65);				
			} else if(c >= 97 && c <= 122) {
				int idx = c - 97;
				counting[idx] += 1;
				//System.out.printf("%c<->%d->%d\n", c, (int)c, c - 97);				
			}
		}
		
		System.out.println(Arrays.toString(counting));
		
		
	}

}
