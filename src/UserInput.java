import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Are you a tea person or coffee?");
		String drink = sc.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You'll get your " + drink + " in a short while.");
	}

}
