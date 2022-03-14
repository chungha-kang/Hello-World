package exam02;

public class Sample07 {

	public static void main(String[] args) {
		/*
		 * 중첩 반복
		 */
		for(int i = 1; i <= 3; i++) {
			System.out.println("i 가 1번 반복할 떄마다");
			for(int j = 1; j <= 3; j++) {
				System.out.println("j 의 은 3번씩 총 9번 이루어진다.");
			}	
		}
		System.out.println("");
		
		/*
		 * 구구단
		 */
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", i, j, i * j);
			}
			System.out.println("");
		}
		
		/*
		 * 다음 결과가 나올수 있도록 중첩반복문을 사용하시오. (띄어쓰기는 \t 를 사용하다록 한다.) (탭공백)
		 * 
		 * 1
		 * 2	3
		 * 4	5	6
		 * 7	8	9	10
		 * 11	12	13	14	15
		 */
		
		/*
		// 내 풀이
		for(int i = 1; i <= 15; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.printf("%d\t*%d\n", i, j);
			}
		}	
		//모르겠닼ㅋㅋㅋㅋㅋ
		*/
		
		// 강사님 풀이
		int n = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j =1; j <=1; j++) {
				System.out.print(++n + "\t");
			}
			System.out.print("/n");
		}
	}

}
