package lcod.inheritance;

public class CalculatorMain {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		
		c1.setOperands(8, 2);
		c1.sum();
		c1.avg();
		c1.sub();

	}

}
