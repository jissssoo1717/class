package solution;



/* 문제 6, 7, 8, 9, 10, 12, 13, 14, 15, 16*/
public class ForWhile {

	public static void main(String[] args) {
		// 문제 06.
		int sol6Sum = 0;
		int sol6Num = 1;
		
		while(sol6Num < 100) {
			sol6Sum += sol6Num;
			sol6Num++;
		}
		System.out.println(sol6Sum);
		
		
		// 문제 07.
		int sol7Num = 1;
		while(sol7Num < 101) {
			System.out.println(sol7Num);
			sol7Num++;
		}
		
		do {
			sol7Num--;
			System.out.println(sol7Num);
		}
		while(sol7Num > 1);
		
		
		// 문제 08.
		int sol8Num = 1;
		int sol8Sum = 0;
		
		while(sol8Num < 1001) {
			if(sol8Num % 2 == 0 && sol8Num % 7 == 0) {
				System.out.println(sol8Num);
				sol8Sum += sol8Num;
			}
			sol8Num++;
		}
		System.out.println(sol8Sum);
		
		
		// 문제 09.
		int sol9Mul = 1;
		
		for(int i = 1; i < 11; i++) {
			sol9Mul *= i;
		}
		System.out.println(sol9Mul);
		
		
		// 문제 10.
		for(int i = 1; i < 10; i++) {
			System.out.println("5 X " + i + " : " + 5*i);
		}
		
		
		// 문제 12.
		int sol12Num = 1;
		int sol12Sum = 0;
		
		while(true) {
			if(sol12Num % 2 != 0 || sol12Num % 3 == 0) {
				sol12Sum += sol12Num;
			}
			
			if(sol12Sum >= 1000) {
				System.out.println(sol12Num);
				System.out.println(sol12Sum);
				break;
			}
				
			sol12Num++;
		}
		
		
		// 문제 13.
		int sol13Num = 2;
		while(sol13Num < 10) {
			for(int i = 1; i <= sol13Num; i++) {
				System.out.println(sol13Num + "X" + i + "=" + sol13Num*i);
			}
			
			sol13Num *= 2;
		}
		
		
		// 문제 14.
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i + j == 9) {
					System.out.printf("A:%d  B:%d\n", i, j);
				}
			}
		}
		
		
		// 문제 15.
		int n = 1;
		
		// 15-1 If
		if(n == 1) {
			System.out.println("현재 인원은 1명입니다");
		}
		else if(n == 2) {
			System.out.println("현재 인원은 2명입니다");
		}
		else if(n == 3) {
			System.out.println("현재 인원은 3명입니다");
		}
		else if(n > 3) {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		
		// 15-2 Switch
		switch(n) {
			case 1:
				System.out.println("현재 인원은 1명입니다");
				break;
			case 2:
				System.out.println("현재 인원은 1명입니다");
				break;
			case 3:
				System.out.println("현재 인원은 1명입니다");
				break;
			default:
				System.out.println("현재 많은 사람들이 있습니다.");
				break;
			
		}
		
		
		// 문제 16.
		
		// 16-1 while
		int sumWhile = 0;
		int numWhile = 1;
		while(numWhile < 100) {
			sumWhile += numWhile;
			numWhile++;
		}
		System.out.println(sumWhile);
		
		// 16-2 for
		int sumFor = 0;
		for(int i = 1; i < 100; i++) {
			sumFor += i;
		}
		System.out.println(sumFor);
		
		// 16-3 do-While
		int sumDoWhile = 0;
		int numDoWhile = 1;
		do {
			sumDoWhile += numDoWhile;
			numDoWhile++;
		}
		while(numDoWhile < 100);
		
		System.out.println(sumDoWhile);
			
	}
}


