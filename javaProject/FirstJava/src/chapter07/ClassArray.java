package chapter07;

public class ClassArray {

	public static void main(String[] args) {
		
		// 상위 타입의 배열 인스턴스 생성
		Phone[] phones = new Phone[5];
		
		// Phone 타입의 참조변수
		phones[0] = new AndroidPhone("11");
		phones[1] = new IPhone("22");
		phones[2] = new IPhone("33");
		phones[3] = new AndroidPhone("44");
		phones[4] = new AndroidPhone("55");

		for(Phone phone : phones) {
			phone.call();
		}

	}

}
