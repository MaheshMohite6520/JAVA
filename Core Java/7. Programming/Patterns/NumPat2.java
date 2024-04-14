class NumPat2
{
	public static void main(String[] args) 
	{
		int n = 4;

		int incr = 1;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.print(incr + i + " ");
				incr += n;
			}

			incr = 1;

			System.out.println();
		}
	}
}
