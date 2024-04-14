import java.util.Scanner;

class DynamicFloat
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		float num1 = sc.nextFloat();

		System.out.println("Enter second number: ");
		float num2 = sc.nextFloat();

		float sum = num1 + num2;
		System.out.println("Sum: " +sum);
	}
}
