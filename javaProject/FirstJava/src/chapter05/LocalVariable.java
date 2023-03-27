package chapter05;

public class LocalVariable {
	
	void method(int num) {
		// 매개변수는 지역변수로 메소드 호출 시에 생성 -> 메소드 종료 시에 소멸
		
		// 메소드 블록 안에서 선언되는 변수도 지역변수
		// 선언 시점에 메모리 생성 -> 메소드가 종료될 때 소멸됨
		int lv = 10;
		
		if(false) {
			boolean chk = true;
			System.out.println(chk);
		}
		else {
			boolean chk = false;
			System.out.println(chk);
		}
		
		// System.out.println(chk); ==> chk는 if-else 블록 내에서만 사용 가능한 변수 
		
		/*
		int i = 0;
		
		for(int i = 0; i < 5; i++) {   ==> 위에서 이미 i가 선언되어잇삼;
			System.out.println("ㄴㅇ");
		}
		*/
		
		while(lv < 5) {
			int lv2 = 100;
			System.out.println(lv2);
			lv++;
		}
	
	}
	
	void method2(int num) {
		int lv = 10;
	}

}
