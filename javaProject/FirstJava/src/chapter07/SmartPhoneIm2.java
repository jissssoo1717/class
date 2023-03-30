package chapter07;

public class SmartPhoneIm2 extends Phone {

	String model;

	public SmartPhoneIm2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println(model + " 이어팟을 이용해서 통화합니다.");
	}
	
	void playMusic() {
		System.out.println("음악을 듣습니다.");
	}
	
	
	
	
	public static void main(String[] args) {

		// 다형성 : 상위 타입의 참조변수에 다양한 하위타입의 인스턴스를 참조할 수 있는 것
		Phone p = new SmartPhoneIm2("010-0000-0000", "IOS");
	
		p.call(); // 하위 타입 인스턴스에 정의되어 있는 오버라이딩된 call() 메소드가 호출됨
		
		// p.playMusic();
		/*
		SmartPhoneIm2 p2 = new SmartPhoneIm2("000", "test");
		p2.playMusic();
	*/
		SmartPhoneIm2 p2 = (SmartPhoneIm2)p; // 형변환을 통해 하위 기능을 사용
		p2.playMusic();
		
	
	
	
	}
	
	
}
