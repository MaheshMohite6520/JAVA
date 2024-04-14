import java.util.Scanner;

class DynamicLong
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		long num1 = sc.nextLong();

		System.out.println("Enter second number: ");
		long num2 = sc.nextLong();

		long sum = num1 + num2;
		System.out.println("Sum: " +sum);
	}
}
