package chapter07;

public class ClassCasting1 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("011-1231-1111");
		
		Phone phone = new AndroidPhone("11");
		Phone p = new IPhone("22");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone; // 하위타입의 참조변수를 상위타입으로 변경은 생략 가능
		
		AndroidPhone phone3 = (AndroidPhone)phone;
		// AndroidPhone phone4 = (AndroidPhone)p; // new IPhone("22") => 오류 발생
	
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) {
			iPhone = (IPhone)p;
			iPhone.call();
		} else if(p instanceof AndroidPhone) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}
		
		
		
	
	}

}
