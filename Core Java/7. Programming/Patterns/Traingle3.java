import java.util.Scanner;

class Traingle3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		/*
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j < n-i-1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
		*/

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (j >= n-i-1)
				{
					System.out.print("*" + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}
}
