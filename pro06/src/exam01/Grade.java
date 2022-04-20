package exam01;

public class Grade {
	private String name;
	private double score;
	private char rank;
	
	public Grade(String name) {
		this.name = name;
	}
	
	public Grade(String name, double score) {
//		this(name);
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
		/*
		 *  점수가 설정되면 여기에 등급을 분류하기 위한 코드를 작성
		 *  A: 100 이하 ~ 90 이상, B: 90 미만 ~ 80 이상, C: 80 미만 ~ 70 이상
		 *  D: 70 미만 60 이상, E: 60 미만 ~ 40 이상,  F: 40 미만
		 */
		if (score >= 0 && score <= 39) {
			System.out.println("F 등급 입니다.");
		} else if(score <= 59) {
			System.out.println("E 등급 입니다.");
		} else if(score <= 69) {
			System.out.println("D 등급 입니다.");
		} else if(score <= 79) {
			System.out.println("C 등급 입니다.");
		} else if(score <= 89) {
			System.out.println("B 등급 입니다.");
		} else {
			System.out.println("A 등급 입니다.");
		}
				
	}	
	
	public char getRank() {
		return rank;
	}
	
}
