
public class Expressions {

	public static void main(String[] args) {
		// Expression is a combination of Operands and operators
		// Operands are values, variables numbers or any quantity
		// Operators are any Arithmetic symbols : + , - , * , / , %
		
		double x = 10;
		
		x = x + 1;
		System.out.println("Addition:" + x);
		
		x = x - 1;
		System.out.println("Subtract:" + x);
		
		x = x * 4;
		System.out.println("Multiply:" + x);
		
		x = x / 2;
		System.out.println("Division:" + x);
		
		x = x % 2;
		System.out.println("Remainder:" + x);
		
		x = (double) 10 / 3;
		System.out.println("Division:" + x);
	}

}
