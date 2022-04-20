package exam01;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int rangeMin = 1;
	private int rangeMax = 45;
	private int count = 6;
	private int[] numbers;
	
	Random rand = new Random();

	public Lotto() {
		
	}
	
	public Lotto(int min, int max, int count) {
		
	}
	
	public void generate(int n1) {
		int[] iArr = new int[6];
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = rand.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(iArr));
	}
	
	public void generate(int n1, int n2) {
		
	}

	public void generate(int n1, int n2, int n3) {
		
	}

	public void generate(int n1, int n2, int n3, int n4) {
		
	}

	public void generate(int n1, int n2, int n3, int n4, int n5) {
		
	}

	public int getRangeMin() {
		return rangeMin;
	}

	public void setRangeMin(int rangeMin) {
		this.rangeMin = rangeMin;
	}

	public int getRangeMax() {
		return rangeMax;
	}

	public void setRangeMax(int rangeMax) {
		this.rangeMax = rangeMax;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int[] getNumbers() {
		return numbers;
	}

}
