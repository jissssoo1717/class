package chapter08.example;

public class CalculatorMain {

	public static void main(String[] args) {

		Calculator cal = new CalculatorClass2();
		
		System.out.println(cal.add(5, 5));
		System.out.println(cal.substract(70, 60));
		System.out.println(cal.multiply(4, 5));
		System.out.println(cal.divide(30, 6));		
		
	}

}
