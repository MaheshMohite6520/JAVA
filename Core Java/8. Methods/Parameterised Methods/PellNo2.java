class PellNo2
{
	public static void main(String[] args) 
	{
		printPellSeries(10);
	}

	public static void printPellSeries(int num)
	{
		if (num >= 1)
		{
			System.out.println(0);
		}
		if (num >= 2)
		{
			System.out.println(1);
		}
			
		int n1 = 0;
		int n2 = 1;

		for (int i = 3; i <= num; i++)
		{
			int n3 = 2 * n2 + n1;
			System.out.println(n3);

			n1 = n2;
			n2 = n3;
		}
	}
}
