package chapter08;

public class SmartPhoneMain {

	public static void main(String[] args) {

		// Phone p = new Phone(); // 인스턴스 생성 불가
		
		SmartPhone sp = new SmartPhone("010-1111-1111", "IOS");
		Phone p = new SmartPhone("010-2222-2222", "Android");
		sp.turnOn();
		p.turnOn();
		
		sp.game();
		
		sp.call();
		p.call();

	}

}
