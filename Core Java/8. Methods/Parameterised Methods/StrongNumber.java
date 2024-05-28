import java.util.Scanner;

class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if (sum(num) == num)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}

	public static int factorial(int num)
	{
		int fact = 1;
		for (int i = 1; i <= num; i++)
		{
			fact *= i;
		}

		return fact;
	}

	public static int sum(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += factorial(last);
			num /= 10;
		}

		return sum;
	}
}
