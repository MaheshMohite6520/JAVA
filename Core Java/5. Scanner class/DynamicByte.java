import java.util.Scanner;

class DynamicByte
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextByte();

		System.out.println("Enter second number: ");
		int num2 = sc.nextByte();

		int sum = num1 + num2;
		System.out.println("Sum: " +sum);
	}
}
