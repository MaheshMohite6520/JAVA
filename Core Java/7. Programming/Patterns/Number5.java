import java.util.Scanner;

class Number5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int n = sc.nextInt();

		int val = 0;

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				/*
				if (val <= 9)
				{
					System.out.print(val + i + " " + " ");
				}
				else
				{
					System.out.print(val + i + " ");
				}
				*/

				System.out.print(val + i + " ");

				val += n;
			}
			val = 0;

			System.out.println();
		}
	}
}
