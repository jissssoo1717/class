package chapter05;


// Method Overloading test Main
public class AdderMain {

	public static void main(String[] args) {

		Adder adder = new Adder();
		
		System.out.println(adder.add(5,5));
		System.out.println(adder.add(7f, 5f));
		adder.add(10);

	}

}
