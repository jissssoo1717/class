package chapter07.example;

/*
1. Person 이라는 클래스를 정의해봅시다.
	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
	② 인사하는 메소드를 정의해봅시다.
	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
*/

public class Person {
	
	String name;
	String pNumber;
	int age;
	
	public Person(String name, String pNumber, int age) {
		this.name = name;
		this.pNumber = pNumber;
		this.age = age;
	}
	
	public Person() {}


	void printHello() {
		System.out.print("안녕하세요. 저는 " + name + "입니다. ");
		System.out.println(age + "살 입니다.");
	}
	
	void printPersonInfo() {
		System.out.println("이름="+name+", 주민등록번호="+pNumber+", 나이="+age);
	}

}
