package chapter08;

public abstract class Phone {
	
	String phoneNumber;

	
	// Constructor
	public Phone(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 걸어 통화합니다.");
	}
	
	abstract void turnOn(); // 스마트폰 모델에 따라 전원을 키는 기능이 다르게 정의됨
	
	
	
	

}
