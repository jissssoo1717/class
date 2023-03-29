package chapter06.example;

public class StudentSolved {
	
	private String sName;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	
	public StudentSolved(String sName, int korScore, int engScore, int mathScore) {
		this.sName = sName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}



	public StudentSolved() {
	}



	public String getsName() {
		return sName;
	}



	public void setsName(String sName) {
		this.sName = sName;
	}



	public int getKorScore() {
		return korScore;
	}



	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}



	public int getEngScore() {
		return engScore;
	}



	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}



	public int getMathScore() {
		return mathScore;
	}



	public void setMathScore(int mathScore) {
		mathScore = mathScore;
	}
	
	// 총점 계산해서 반환하는 메소드
	private int sum() {
		return korScore + engScore + mathScore;
	}
	
	private float avg() {
		return sum()/3f;
	}
	
	public String result() {
		return sName+"\t"+korScore+"\t"+engScore+"\t"+mathScore+"\t"+sum()+"\t"+avg();
	}



	@Override
	public String toString() {
		/*
		return "StudentSolved [sName=" + sName + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
				+ mathScore + "]";
		 */
		return result();
	}
	
	
	
	
}
