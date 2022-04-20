package exam02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 로또 번호 생성
		 * 		- 1 ~ 45 까지의 랜덤 번호를 생성하여 리스트에 담는다.
		 * 		- 중복된 값이 없어야 한다.
		 * 		- 총 6개의 정수값이 리스트에 담길 수 있게 한다.
		 * 		- 마지막에 출력할 때에는 오름차순으로 정렬하여 출력한다.
		 */
		// List 대신 Set 사용
		Set<Integer> lotto = new HashSet<Integer>();
		Random rand = new Random();
		for(int i = 0; i < 6;) {
			int r= rand.nextInt(45) + 1;
			if(lotto.add(r)) {
				i++;
			}
		}		
		System.out.println(lotto);

	}

}
