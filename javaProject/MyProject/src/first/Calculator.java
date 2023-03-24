package first;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(add(20, 10));
		System.out.println(sub(20, 10));
	}
	
	static long add(long num1, long num2) {
		
		return num1 + num2;
	}
	
	static long sub(long num1, long num2) {
		
		return num1 - num2;
	}
	

	float div(float num1, float num2) {
		
		return num1 / num2;
	}

}
