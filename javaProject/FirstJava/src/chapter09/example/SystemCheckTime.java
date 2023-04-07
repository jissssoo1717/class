package chapter09.example;

public class SystemCheckTime {
	
	public static void main(String[] args) {
		
		//long startTimeForMillis = System.currentTimeMillis();
		long startTimeForNano = System.nanoTime();
		
		int sum = 0;
		
		for(int i = 1; i <= 100000000; i++) {
			sum++;
		}
		
		//long endTimeForMillis = System.currentTimeMillis();
		long endTimeForNano = System.nanoTime();
		
		//System.out.println("실행 시간 Millis : "  + (endTimeForMillis - startTimeForMillis));
		System.out.println("실행 시간 Nano : "  + (endTimeForNano - startTimeForNano));
	}
	

}
