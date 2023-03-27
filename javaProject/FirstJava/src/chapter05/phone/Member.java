package chapter05.phone;

public class Member {
	
	// Variable
	String name;
	String email;
	int age;
	String phoneNumber;
	
	
	// Constructor
	public Member(String name, String email, int age, String phoneNumber) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Member(String name, String email) {
		
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "There is no data.";
	}
	
	void showData() {
		System.out.println("이름 : " + name); // 'this.name'	 is possible
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + phoneNumber);
		
	}
	
}
