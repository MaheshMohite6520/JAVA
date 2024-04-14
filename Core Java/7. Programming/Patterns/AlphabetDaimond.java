import java.util.Scanner;

class AlphabetDaimond 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		int star = 1;
		int space = n/2;

		char ch = 'a';

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < space; j++)
			{
				System.out.print(" " + " ");
			}
			for (int j = 0; j < star; j++)
			{
				System.out.print(ch++ + " ");
			}

			if (i >= n/2)
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
