import java.util.Scanner;

class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (num > 0)
		{
			if (num % 7 == 0)
			{
				System.out.println("It is a Buzz Number.");
			}
			else
			{
				int last = num % 10;
				if (last == 7)
				{
					System.out.println("It is a Buzz Number.");
				}
				else
				{
					System.out.println("It is not a Buzz Number.");
				}
			}
		}
		else
		{
			System.out.println("It is not a Buzz Number.");
		}
	}
}
