package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// Define Array
		int [] scores; // get Instance address of type Integer
		
		// Create Array
		scores = new int[10]; // create array instance having 10 elements of integer type
		
		/*
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		System.out.println( );
		*/
		
		// Refer of Array element
		// ArrayName[index]
		// index => 0 ~ the number of elements - 1
		// the number of elements => Array.length
		
		scores[0] = 60;
		scores[1] = 44;
		scores[2] = 50;
		scores[3] = 56;
		scores[4] = 13;
		scores[5] = 37;
		scores[6] = 94;
		scores[7] = 12;
		scores[8] = 64;
		scores[9] = 32;
		// score[10] = 60; ==> Error : out of bounds for length 10
		
		
		resultPrint(scores);
		
	}
	
	// Method print the Sum and Average get Array having integer elements
	static void resultPrint(int[] arr) { // int[] arr = scores;
		
		// parameter : Array of type int
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / (float)arr.length;
		
		System.out.println("========================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
}
