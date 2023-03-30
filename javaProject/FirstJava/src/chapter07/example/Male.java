package chapter07.example;

public class Male extends Person {
	
	//int age;
	String gender = "남자"; 

	public Male() {
		
	}

	public Male(String name, String pNumber, int age, String gender) {
		super(name, pNumber, age);
		this.gender = gender;
	}
	
	@Override
	void printHello() {
		super.printHello();
		System.out.println("성별은 " + gender +"입니다.");
	}
	
	
}
