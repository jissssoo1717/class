package chapter05;

public class ClassVariable {
	
	static String name = "HOI";
	static int age = 10;
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다."); // name 멤버로 인식함
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "살 입니다.");
	}


}
