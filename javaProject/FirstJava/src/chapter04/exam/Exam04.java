package chapter04.exam;

public class Exam04 {

	public static void main(String[] args) {
		
		// SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.
		/*
		 int n=3;
         switch(n) { ==> n : 4Byte 이하의 정수, String(1.7 이하에서는 사용 x)
            case 1:  // n == 1
                System.out.println("Simple Java");
                break;
            case 2:  // n == 2
                System.out.println("Funny Java");
                break;
            case 3:  // n == 3
                System.out.println("Fantastic Java");
                break;
            default:  // else
                System.out.println("The best programming language");
         }
         System.out.println("Do you like coffee?");
		 */
		
		int n=3;
		
		if(n == 1) {
			System.out.println("Simple Java");
		}
		else if(n == 2) {
			System.out.println("Funny Java");
		}
		else if(n == 3) {
			System.out.println("Fantastic Java");
		}
		else {
			System.out.println("The best programming language");
		}
		
		System.out.println("Do you like coffee?");
		

	}

}
