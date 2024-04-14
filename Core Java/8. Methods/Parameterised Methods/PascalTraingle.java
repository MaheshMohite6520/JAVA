class PascalTraingle 
{
	public static int factorial(int num)
	{
		int fact = 1;
		
		for (int i = 1; i <= num; i++)
		{
			fact *= i;
		}

		return fact;
	}

	public static void main(String[] args)
	{
		int n = 4, i, j;

		for (i = 0; i <= n; i++) 
		{
			for (j = 0; j <= n - i; j++) 
			{
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) 
			{
				System.out.print(" " + factorial(i) / (factorial(i - j) * factorial(j)));
			}

			System.out.println();
		}
	}
}
