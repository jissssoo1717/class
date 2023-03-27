package chapter05;

public class ClassMethod {
	
	int iv = 10; // Instance Variable
	
	static int cv = 30; // Class Variable
	
	// Instance Method
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void printNumber2() {
		System.out.println("Class Method");
		
		// printNumber1();
		
		// Create Instance For Using Instance member
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.iv);
		cm.printNumber1();
	}
	
	public static void main(String[] args) {
		
		// 클래스 메소드의 호출 : 클래스이름.매소드이름();
		ClassMethod.printNumber2(); // 클래스 이름 생략 가능
		
		
	}

}
