package solution;



/* 문제 1, 2, 5*/
public class IfReit {

	public static void main(String[] args) {
		
		// 문제 01. 
		int num = 120;
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("양수이면서 짝수");
		}
		
		
		// 문제 02.
		if(num < 0) {
			System.out.println("0 미만");
		}
		else if(num >= 0 && num < 100) {
			System.out.println("0 이상 100 미만");
		}
		else if(num >= 100 && num < 200) {
			System.out.println("100 이상 200 미만");
		}
		else if(num >= 200 && num < 300) {
			System.out.println("200 이상 300 미만");
		}
		else {
			System.out.println("300 이상");
		}
		
		
		// 문제 05.
		if(num < 0) {
			System.out.println("0 미만");
		}
		else {
			switch(num / 100) {
				case 0:
					System.out.println("0 이상 100 미만");
					break;
				case 1:
					System.out.println("100 이상 200 미만");
					break;
				case 2:
					System.out.println("200 이상 300 미만");
					break;
				default:
					System.out.println("300 이상");	
			}
		}		
	}

}
