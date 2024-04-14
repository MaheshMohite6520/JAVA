import java.util.Scanner;

class NumberTraingle3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		int incr = 1;

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				if (j <= n-i+1)
				{
					// System.out.print(incr + " ");
					// incr++;

					// System.out.print(incr++ + " ");

					if (incr <= 9)
					{
						System.out.print(incr++ + " " + " ");
					}
					else
					{
						System.out.print(incr++ + " ");
					}
				}
				else
				{
					if (incr <= 9)
					{
						System.out.print(" " + " ");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
