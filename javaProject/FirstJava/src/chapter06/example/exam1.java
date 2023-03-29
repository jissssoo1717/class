package chapter06.example;

// 1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.
public class exam1 {

	public static void main(String[] args) {

		int[][] scores = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 
				{ 1, 2, 3, 2, 5, 6, 4, 8, 2, 4 },
				{ 3, 2, 7, 4, 4, 6, 7, 8, 3, 8 } 
		};

		for (int[] temp : scores) {

			for (int sc : temp) {
				System.out.print(sc + " ");
			}
			System.out.println();
		}
		
		for(float i : returnAvg(scores)) {
			System.out.println("평균 : " + i);
		}
	}

	static float[] returnAvg(int[][] scores) {
		
		float[] avg = new float[3];
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			
			avg[i] = (float)sum / scores[i].length;
			
		}
		
		return avg;
	}

}
