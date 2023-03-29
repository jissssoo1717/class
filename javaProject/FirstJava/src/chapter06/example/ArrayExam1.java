package chapter06.example;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		// 1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고,
		// 평균 점수를 출력하는 프로그램을 작성해봅시다.

		String[] sName = {"a", "b"};
		int[] korScore = {100, 80, 60, 40, 80, 50, 60, 50, 90, 40};
		int[] engScore = {70, 40, 60, 20, 100, 40, 60, 80, 95, 40};
		int[] mathScore = {90, 40, 65, 47, 20, 53, 75, 50, 65, 100};
		
		System.out.println("국어 \t영어 \t수학 \t총점 \t평균 ");
		for(int i = 0; i < 10; i++) {
			int sum = korScore[i] + engScore[i] + mathScore[i];
			float avg = sum / 3f;
			System.out.println(korScore[i] + "\t" + engScore[i] + "\t" + mathScore[i] + "\t" + sum + "\t" + avg + "\t");
		}
		
		System.out.println();
		
		
		
		int[][] scores = {
			{100, 90, 50},
			{90, 80, 20},
			{10, 40, 80},
			{80, 70, 25},
			{100, 90, 41},
			{16, 90, 45},
			{80, 40, 50},
			{100, 60, 50},
			{80, 90, 50},
			{16, 90, 70}
		};
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				sum += scores[i][j];
			}
			
			System.out.print(sum + "\t");
			System.out.print(sum/3f + "\t");
			System.out.println();
		}
		
		
	}

}
