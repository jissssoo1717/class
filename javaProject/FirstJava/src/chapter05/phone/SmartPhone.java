package chapter05.phone;

public class SmartPhone {
	
	//Instance Variable
	String color;
	float size;
	int volume;
	
	// Constructor : Initialization Method, Initialize Instance Variable
	// Drop If there is no Initialization
	
	// Default Constructor
	/*SmartPhone() {
		//System.out.println("인스턴스 생성!");
		color = "white";
		size = 4.5f;
		volume = 5;
	}*/
	
	// Define Constructor for initialization
	SmartPhone(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
	}
	
	SmartPhone(String color, float size) {
		
		this(color, size, 0); // this() -> Call Other Constructor
		
		/*
		this.color = color;
		this.size = size;
		this.volume = 0;
		*/
	}
	
	SmartPhone() {
		this("White", 4.5f , 0);
		
		/*
		color = "white";
		size = 4.5f;
		volume = 5;
		*/
	}
	
	void call() {
		System.out.println("전화 걸기!");
	}
	
	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}
}
