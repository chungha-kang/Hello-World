package exam02;

public class Sample09 {

	public static void main(String[] args) {
		/*
		 * 문자열에서 문자만 추출하는 방법
		 * 		문자열변수명.charAt(위치값) : 문자열에서 위치값에 해당하는 문자를 추출.
		 *
		 * 문자열의 길이를 알아내는 방법
		 * 		문자열변수명.Length() : 문자열의 문자수를 알려준다.
		 */
		String s = "Hello Java Programming";
		char c = s.charAt(3);	// 0 -> H, 1 -> e, 2 -> l (문자열 위치값 순서)
		System.out.println(c);
		System.out.println("문자열의 길이 : " + s.length()); 
		
		/*
		 * 1. 다음의 문자열에서 대문자의 수와 소문자의 수를 구하시오.
		 * 2. 다음의 문자열에서 단어의 수를 구하시오. (단어는 공백을 기준으로 구분하여 보면 된다.)
		 */
		
		// 내 풀이
		/*
		s = "Hello Java Programming";
		char c = s.charAt(3);
		System.out.println(c);
		System.out.println("문자열의 대문자의 수 : ");
		*/
		
		// 강사님 풀이
		s = "Hello Java Programming";
		
		int c1 = 0, c2 = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {	// 대문자의 조건
				c1++;										// 조건이 안맞으면 실행 되어 카운팅 된다.
			} else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') { // 소문자의 조
				c2++;
			}
		}
		System.out.printf("대문자 수 : %d\n소문자수 : %d\n", c1, c2);
		
		boolean sStart = false;	// 문자열 시작 -> 영문자 범위이면 true;
		boolean sEnd = false;	// 문자열 끝 -> 공백이면 true;
		int wordCount = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				sStart = true;
			} else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sStart = true;
			} else if(s.charAt(i) == ' ') {
				sEnd = true;
			}
			
			if(sStart && sEnd) {
				wordCount++;
				sStart = false;	sEnd = false;
				continue;	// 단어 하나 확인 했으면 밑에 과정 갈 필요가 없으므로 continue;
			}
			
			if(i == s.length() - 1) {	// 위치(index) = 길이(length) - 1	// 문자열 위치(0,1,2) 길이 (3)
				if(sStart) {
					wordCount++;
				}
			}
		}
		System.out.println("단어 수 : " + wordCount);
	}
}

