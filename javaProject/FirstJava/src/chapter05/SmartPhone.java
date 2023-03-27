package chapter05;

public class SmartPhone {
	
	// 변수 선언 => 멤버 변수 / 인스턴스 변수
	String color = "white"; // 속성: 색상 값
	float size; 		// 속성: 사이즈
	int volume = 0; 		// 속성: 볼륨 크기
	
	SmartPhone() {
		
	}
	
	
	
	// 메소드 정의 => 인스턴스 메소드
	// 전화 걸기 기능
	void call(String number) {
		
		System.out.println("전화를 겁니다. " + number);
	}
	
	// 볼륨을 키우는 기능
	void volumeUp() {
		volume++; // 클래스에 이미 선언되어있기 때문에
		          // 변수 내에서 선언 X
	}
	
	// 볼륨을 낮추는 기능
	void volumeDown() {
		volume--;	
	}
	
	
	public static void main(String[] args) {
		
		// 클래스를 인스턴스로 만든다 => 인스턴스화
		// 인스턴스화 => 클래시에 정의된 변수와 메소드가 메모리로 로드된다.
		// 참조변수 선언 = new 클래스이름();
		
		
		// 참조변수 선언 => 클래스 이름 변수 이름; --> 인스턴스 메모리 주소값을 저장
		SmartPhone sp = new SmartPhone(); // 참조 변수의 초기화는 null값 사용
		/* SmartPhone sp = null;
		   sp = new SmartPhone(); */
		// 인스턴스의 생성 => 클래스에 정의된 멤버들이 메모리로 로드된다
		// 인스턴스 메모리의 주소값을 반환
		
		// 인스턴스 변수의 참조 => 참조변수.변수이름
		
		System.out.println("스마트폰의 색상: " + sp.color);
		System.out.println("스마트폰의 사이즈: " + sp.size);
		System.out.println("스마트폰의 볼륨 크기: " + sp.volume);
		
		sp.color = "gold";
		sp.size = 6.0f;
		System.out.println("스마트폰의 색상: " + sp.color);
		System.out.println("스마트폰의 사이즈: " + sp.size);
		
		System.out.println();
		
		
		// 인스턴스 메소드의 호출
		sp.call("119");
		
		// 볼륨의 값을 변경하는 방법
		// 1. 변수에 직접 대입(사용 X)
		// 2. 메소드를 통해서 변경
		System.out.println("현재 볼륨 값: " + sp.volume);
		sp.volumeUp();
		sp.volumeUp();
		sp.volumeUp();
		System.out.println("현재 볼륨 값: " + sp.volume);
		sp.volumeDown();
		System.out.println("현재 볼륨 값: " + sp.volume);
	}
}
