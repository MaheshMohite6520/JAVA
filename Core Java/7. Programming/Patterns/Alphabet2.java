import java.util.Scanner;

class Alphabet2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();

		char ch = 'z';

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
	}
}
