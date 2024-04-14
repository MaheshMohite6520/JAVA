import java.util.Scanner;

class NumberDaimond2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		int star = 1;
		int space = n/2;

		int incr = n * 2;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < space; j++)
			{
				
				if (incr <= 9)
				{
					System.out.print(" " + " " + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
				

				// System.out.print(" " + " ");
			}

			for (int j = 0; j < star; j++)
			{
				
				if (incr <= 9)
				{
					System.out.print(incr++ + " " + " ");
				}
				else
				{
					System.out.print(incr++ + " ");
				}
				

				// System.out.print(incr-- + " ");
			}

			if (i > n/2 - 1)
			{
				space++;
				star -= 2;
			}
			else
			{
				space--;
				star += 2;
			}

			System.out.println();
		}
	}
}
