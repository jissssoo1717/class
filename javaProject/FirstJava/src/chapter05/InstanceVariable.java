package chapter05;

public class InstanceVariable {

	static String name = "KING"; // 클래스 변수
	int age = 12; // 인스턴스 변수
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나의 이름은 " + ClassVariable.name + "입니다.");
	}
	
	void tellAge()
	{
		System.out.println("나이는 " + age + "살 입니다.");
	}

	public static void main(String[] args) {
		
		// 인스턴스 변수는 인스턴스를 생성했을 때 생성 -> 인스턴스가 소멸될 때 같이 소멸됨
		
		InstanceVariable iv = new InstanceVariable();
		
		System.out.println(iv.name);
		System.out.println(iv.age);
		
		System.out.println(iv.name);
		System.out.println(iv.age);
		
		// iv = null;
		
		iv.tellName();
		iv.tellAge();
		
		InstanceVariable.name = ""; // 클래스 변수 참조 방법
		
	}
	
	
}

