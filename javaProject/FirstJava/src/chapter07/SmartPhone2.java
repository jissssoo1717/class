package chapter07;

public class SmartPhone2 extends Phone {
	
	String model;
	
	// 상위 클래스에 매개변수가 있는 생성자가 있다면 상위 클래스의 멤버를 초기화할 데이터를 받아서
	// 상위 클래스의 생성자를 호출해주어야 한다.
	// 현재 클래스의 멤버를 초기화한다.
	public SmartPhone2(String phoneNumber, String model) {
		// 상위 클래스의 생성자를 호출
		super(phoneNumber);
		// 현재 클래스의 인스턴스 변수 초기화
		
		this.model = model;
	}
	
	void game() {
		super.call();
		System.out.println(model + "게임을 합니다.");
	
	}
	
	public static void main(String[] args) {
		
		SmartPhone2 sp2 = new SmartPhone2("010-5555-7777", "IOS");
		
		sp2.game();
		
	}
	
}
