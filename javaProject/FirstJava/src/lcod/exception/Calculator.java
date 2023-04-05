package lcod.exception;

public class Calculator {
	
	int left, right;
	
	public Calculator() {}

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("나눗셈의 결과는 ");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
		}
		catch (Exception e) {
			System.out.println("오류가 발생했습니다. : " + e.getMessage());
		}
	}
	
	
	
	
}
