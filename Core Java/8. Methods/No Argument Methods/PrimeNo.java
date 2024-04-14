import java.util.Scanner;

class PrimeNo 
{
	public static void main(String[] args) 
	{
		prime();
	}

	public static void prime()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int den = 2;

		while (den < num)
		{
			if (num % den == 0)
			{
				break;
			}
			den++;
		}

		if (num == den)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
}
