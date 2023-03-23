package test;

public class FirstJava {
	
	// 주석은 컴파일 시에 코드로 인식 X
	// 변수 정의
	// 함수(메소드) 정의
	
	// 메인 메소드 -> 클래스 시작 시 시작 시점
	public static void main(String[] args) {
		
		/*System.out.println("First Java1");
		System.out.println("First Java2");
		System.out.println("First Java3");
		System.out.println("First Java4");*/
		
		// 변수 : 메모리 공간 할당, 메모리 주소의 역할
		// 선언 방법
		// 자료형 타입 변수 이름;
		

		// 나이를 저장하는 변수 선언
		int age; // 변수 선언 -> 정수형의 나이값을 저장할 수 있는 변수 age 선언
		age = 20; // 변수의 초기화 : 변수 선언 후 값을 처음 대입하는 것
		
		// 원주율 : pi(3.141592,,,)
		double pi;
		pi = 3.141592;
		
		System.out.println(age);
		System.out.println(add(1,2));
		
		int resultValue = add(10, 20);
		System.out.println(resultValue);
		
		hello();
		hello2("배고프다");
		}
	
		// 메소드 기본 구조
	    // 반환타입 메소드이름(매개변수) { }
		
		static int add(int num1, int num2) {
			int result;
			result = num1 + num2;
			
			return result;
	
		}
		
		// 인사말을 출력하는 기능을 가지는 메소드
		// 매개변수 : 데이터 받는 정의 -> 데이터 필요 없삼
		// 결과 반환 : X
		// void : 반환 값 없을 때 사용(return X)
		
		static void hello() {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다");

		}
		
		// 이름을 전달받아 이름과 인사말을 출력하는 메소드
		// 매개변수: 이름(문자열)
		// 결과 반환: X
		static void hello2(String name) {
			
			System.out.println(name);
			System.out.println("안녕하세요");
			
		}
}