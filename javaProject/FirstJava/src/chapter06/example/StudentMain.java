package chapter06.example;

/* 
 * 3. main()메소드에 아래 내용을 정의해봅시다. 
 */

public class StudentMain {

	public static void main(String[] args) {
		
		// ① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] students = new Student[10];
		
		// ② Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		students[0] = new Student("1", 55, 72, 36);
		students[1] = new Student("2", 23, 54, 12);
		students[2] = new Student("3", 55, 72, 36);
		students[3] = new Student("4", 55, 72, 36);
		students[4] = new Student("5", 55, 72, 36);
		students[5] = new Student("6", 55, 72, 36);
		students[6] = new Student("7", 55, 72, 36);
		students[7] = new Student("8", 55, 72, 36);
		students[8] = new Student("9", 55, 72, 36);
		students[9] = new Student("10", 55, 72, 36);
		
		// ③ 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		for(Student st : students) {
			System.out.println(st.toString());
		}
		
		System.out.println();
		
		
		// 총점 및 평균 출력 메소드 사용
		for(Student st : students)
		{
			float[] scores = st.returnScores(st.getStName(), st.getScoreKr(), st.getScoreEn(), st.getScoreMath());
			
			for(float num : scores) {
				System.out.print(num + "\t");
			}
			System.out.println();
		
		}
	}

}
