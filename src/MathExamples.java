import java.util.Scanner;

public class MathExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3.14152695;
		double y = -10;
		
		double z = Math.max(x, y);
		System.out.println("Max of numbers: " + z);
		
		double min_z = Math.min(x, y);
		System.out.println("Min of numbers: " + min_z);
		
		double n = 154;
		double sqrt_n = Math.sqrt(n);
		System.out.println("Square root of " + n + " is : " + sqrt_n);
		
		System.out.println("Round / Floor value of X: " + Math.round(x));
		System.out.println("Ceiling Value of X: " + Math.ceil(x));
		
		//Hypotenuse of Triangle
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter side a");
		a = sc.nextDouble();
		
		System.out.println("Enter side b");
		b = sc.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Hypotenuse of Triangle with Sides " + a + " and " + b + " is: " + c);
		
		sc.close();
		
	}

}
