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
		char c = s.charAt(3);
		System.out.println(c);
		System.out.println("문자열의 길이 : " + s.length());
		
		/*
		 * 1. 다음의 문자열에서 대문자의 수와 소문자의 수를 구하시오.
		 * 2. 다음의 문자열에서 단어의 수를 구하시오.
		 */
		s = "Hello Java Programming";
		char c = s.charAt(3);
		System.out.println(c);
		System.out.println("문자열의 대문자의 수 : ");

	}
}

