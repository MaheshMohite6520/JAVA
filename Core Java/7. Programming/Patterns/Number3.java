import java.util.Scanner;

class Number3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the no of rows: ");
		int n = sc.nextInt();

		int val = n-1;

		int prev = 0;

		for (int i = 1; i <= n; i++)
		{
			prev = i;
			System.out.print(prev + "  ");

			for (int j = 2; j <= i; j++)
			{
				prev += val;
				val--;
				System.out.print(prev + " ");
			}
			System.out.println();
			val = n - 1;
		}
	}
}
