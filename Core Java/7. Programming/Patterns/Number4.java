import java.util.Scanner;

class Number4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		int count = 1;

		for (int i = 1; i <= n; i++)
		{
			int incr = i;

			for (int j = 1; j <= i; j++)
			{
				// System.out.print(count + " ");
				// count ++;

				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
