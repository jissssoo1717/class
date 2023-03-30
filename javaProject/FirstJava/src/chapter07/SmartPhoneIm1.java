package chapter07;

public class SmartPhoneIm1 extends Phone {

	String model;

	public SmartPhoneIm1(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
	}
	
	public static void main(String[] args) {
		SmartPhoneIm1 phone = new SmartPhoneIm1("010-2232-2232", "google");
		
		phone.call();
	}
	
	
}
