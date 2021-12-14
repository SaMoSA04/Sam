
public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Ajay";
		String y = "Pawar";
		
		System.out.println("Before Swap:");
		System.out.println("X - " + x);
		System.out.println("Y - " + y);
		
		/*
		 * x = y; System.out.println("X - " + x); System.out.println("Y - " + y);
		 */
		
		/*
		 * y = x; System.out.println("X - " + x); System.out.println("Y - " + y);
		 */
		
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swap:");
		System.out.println("X - " + x);
		System.out.println("Y - " + y);
		
		
	}

}
