package solution;



/* 문제 11 */
public class ContinueBasic {

	public static void main(String[] args) {
		// 문제 11.
        int count = 0;
        
        for(int i = 1; i <= 100; i++) {
        	if(i % 5 != 0 || i % 7 != 0) {
        		continue;
        	}
        	count++;
        	System.out.println(i);
        }
        System.out.println("count: " + count);
	}

}
