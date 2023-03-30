package chapter07;

public class ClassCasting2 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-9999-9999");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
	}
	
	// 매개변수에 다형성을 적용 => 추가적인 메소드 생성이 필요 X
	public static void callByPhone(Phone p) {
		p.call();
	}

	/* 위와 동일
	public static void callByPhone(AndroidPhone p) {
		p.call();
	}
	
	public static void callByPhone(IPhone p) {
		p.call();
	}
	*/

}
