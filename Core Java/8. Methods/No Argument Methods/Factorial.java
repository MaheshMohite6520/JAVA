import java.util.Scanner;

class Factorial 
{
	public static void main(String[] args) 
	{
		factorial();
	}

	public static void factorial()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= num; i++)
		{
			fact *= i;
		}

		System.out.println("Factorial of " + num + " is: " + fact);
	}
}
