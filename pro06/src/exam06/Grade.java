package exam06;

public class Grade {
	/*
	 * 과목에 대한 성적 점수 정보를 가지는 객체
	 */
	// 내 풀이
//	private String name;
//	
//	public Grade(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//}
	
	private String name;
	private double score;
	
	public Grade(String name) {
	this.name = name;
	this.score = 0.0;
	}

	public Grade(String name, double score) {
	this.name = name;
	this.score = score;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getScore() {
		return this.score;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
}
