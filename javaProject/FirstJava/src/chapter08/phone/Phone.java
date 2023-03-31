package chapter08.phone;

public interface Phone {
	
	public static final int PHONE_NUM_1 = 1;
	/*public static final */int PHONE_NUM_2 = 2;
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 9;
	int PHONE_NUM_0 = 0;
	
	public abstract void call();
	
	/*public abstract*/ void turnOn();
	void turnOff();
}
