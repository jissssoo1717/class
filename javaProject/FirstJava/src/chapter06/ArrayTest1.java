package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		// Define Array
		int [] scores; // get Instance address of type Integer
		
		// Create Array
		scores = new int[10]; // create array instance having 10 elements of integer type
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println( );
		
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
		
		// sum
		int sum = 0;
		//average
		float avg = 0f;
		
		
		//System.out.println(scores[0]);
		// index => 0 ~ 9(10 elements)
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("average : " + avg);
		
	}

}
