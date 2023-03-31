package chapter08.phone;

public class SmartPhone implements Phone {
	
	boolean power;

	@Override
	public void call() {
		String num1 = String.valueOf(PHONE_NUM_1);
		String num2 = String.valueOf(PHONE_NUM_2);
		String num3 = String.valueOf(PHONE_NUM_9);
		
		System.out.println(num1 + num2 + num3 + "에 전화합니다.");
	}

	@Override
	public void turnOn() {
		if(!power) {
			power = true;
		}
		
	}

	@Override
	public void turnOff() {
		if(power) {
			power = false;
		}
		
	}
	
	

}
