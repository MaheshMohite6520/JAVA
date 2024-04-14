import java.util.Scanner;

class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int ip = sc.nextInt();

		System.out.println(isPrime(ip));
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
}
