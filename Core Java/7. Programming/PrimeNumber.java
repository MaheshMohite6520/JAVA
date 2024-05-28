import java.util.Scanner;

class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int denominator = 2;

		while(denominator < num)
		{
			if(num % denominator == 0)
			{
				break;
			}
			denominator++;
		}

		if(num == denominator)
		{
			System.out.println(num + " is Prime Number.");
		}
		else
		{
			System.out.println(num + " is Not Prime Number.");
		}
	}
}
