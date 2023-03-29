package chapter06;

public class ArrayTest2 {

	public static void main(String[] args) {

		// Create Instance of Array
		int[] score1 = {100, 70, 49, 59, 88, 50};
		
		System.out.println("Array size of score1 : " + score1.length);
		
		for(int i = 0; i < score1.length; i++) {
			System.out.println(score1[i]);
		}
		
		int[] score2 = new int[] {1, 5, 7, 8, 4};
	
		System.out.println("Array size of score2 : " + score2.length);
		
		for(int i = 0; i < score2.length; i++) {
			System.out.println(score2 [i]);
		}
		
	}

}
