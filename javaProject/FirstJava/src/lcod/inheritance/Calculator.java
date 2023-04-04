package lcod.inheritance;

public class Calculator {
	
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
	
	public void avg() {
		System.out.println((left + right)/2);
	}	
}
