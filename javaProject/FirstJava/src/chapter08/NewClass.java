package chapter08;

public class NewClass extends AbstractClass {

	// 추상 클래스 AbstractClass를 상속하는 NewClass
	
	@Override
	void abstractMethod() {
		
		// AbstractClass의 추상 메소드 abstractMethod()를 오버라이딩함
		System.out.println("추상 메소드를 구현했습니다.");

	}
}
