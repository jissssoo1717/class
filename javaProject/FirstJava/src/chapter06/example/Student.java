package chapter06.example;

/*
2. Student 클래스를 정의해봅시다.
*/

public class Student {

	// ① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
	String studentName;
	int scoreKr;
	int scoreEn;
	int scoreMath;

	// ② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
	// Constructor
	Student(String studentName, int scoreKr, int scoreEn, int scoreMath) {
		this.studentName = studentName;
		this.scoreKr = scoreKr;
		this.scoreEn = scoreEn;
		this.scoreMath = scoreMath;
	}

	/* Getter/Setter */
	// Student Name
	String getStName() {
		return studentName;
	}
	void setStName(String studentName) {
		this.studentName = studentName;
	}

	// Korean Score
	int getScoreKr() {
		return scoreKr;
	}
	void setScoreKr(int scoreKr) {
		this.scoreKr = scoreKr;
	}

	// English Score
	int getScoreEn() {
		return scoreEn;
	}
	void setScoreEn(int scoreEn) {
		this.scoreEn = scoreEn;
	}

	// English Score
	int getScoreMath() {
		return scoreMath;
	}
	void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}
	
	
	// ③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	int getSum() {
		return scoreKr + scoreEn + scoreMath;
	}
	float getAvg(int sum) {
		return (float)getSum() / 3;
	}
	
	@Override
	public String toString() {
		return "이름 = " + studentName + ", 국어 = " + scoreKr + ", 영어 = "
				+ scoreEn + ", 수학 = " + scoreMath + ", 총점 = " + getSum() + ", 평균 = " + getAvg(getSum());
	}

}
