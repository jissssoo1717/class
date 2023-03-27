package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {
	
		// SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성
		SmartPhone sp1 = new SmartPhone();

		SmartPhone sp2 = new SmartPhone();
		sp2.color = "red";
		sp2.size = 4.0f;
		
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		
		// sp1, sp2 참조변수 => 메모리 주소값을 가지는 변수
		// 인스턴스 ,.ㅡ 정보는 힙, 메모리 주소값은 스텍에 저장됨
		
		
		
		sp1 = sp2;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		System.out.println(sp1.color);
		System.out.println(sp1.size);
	
	}	

}
