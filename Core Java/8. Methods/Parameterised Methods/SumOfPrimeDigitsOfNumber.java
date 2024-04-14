import java.util.Scanner;

class SumOfPrimeDigitsOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int ip = sc.nextInt();

		System.out.println(sum(ip));
	}

	public static boolean isPrime(int num)
	{
		int i;
		for (i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				break;
			}
		}

		return num == i;
	}

	public static int sum(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			if (isPrime(num % 10))
			{
				sum += num % 10;
			}
			num /= 10;
		}

		return sum;
	}
}
