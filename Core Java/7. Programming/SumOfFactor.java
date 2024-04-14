import java.util.Scanner;

class SumOfFactor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
				System.out.println(i);
				sum += i;
			}
		}

		System.out.println("Sum of Factors: " + sum);
	}
}
