import java.util.Scanner;

class StaticBlock2 
{
	static Scanner sc;

	static
	{
		System.out.println("Global scanner in available");
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println(num1 + num2);

		concat();
	}

	public static void concat()
	{
		System.out.println("Enter first name: ");
		String fname = sc.next();

		System.out.println("Enter last name: ");
		String lname = sc.next();

		System.out.println(fname + " " + lname);
	}
}