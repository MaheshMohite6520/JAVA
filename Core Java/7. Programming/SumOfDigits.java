import java.util.Scanner;

class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		while(num > 0)
		{
			int last = num % 10;
			sum += last;
			num /= 10;
		}
		System.out.println("Sum of Digits of Number: " + sum);
	}
}
