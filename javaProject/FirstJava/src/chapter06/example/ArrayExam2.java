package chapter06.example;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		// Student 타입의 배열 생성 : 데이터 10개 저장 가능
		StudentSolved[] student = new StudentSolved[10];
		student[0] = new StudentSolved("son01", 100, 100, 100);
		student[1] = new StudentSolved("son02", 50, 100, 50);
		student[2] = new StudentSolved("son03", 100, 20, 40);
		student[3] = new StudentSolved("son04", 70, 100, 100);
		student[4] = new StudentSolved("son05", 100, 30, 20);
		student[5] = new StudentSolved("son06", 80, 100, 100);
		student[6] = new StudentSolved("son07", 90, 40, 40);
		student[7] = new StudentSolved("son08", 100, 60, 80);
		student[8] = new StudentSolved("son09", 50, 40, 30);
		student[9] = new StudentSolved("son10", 100, 80, 90);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===================================");
		
		for(StudentSolved st : student) {
			System.out.println(st.result());
		}

	}

}
