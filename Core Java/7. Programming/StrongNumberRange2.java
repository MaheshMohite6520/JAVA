class StrongNumberRange2 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start < end)
		{
			int sum = 0;
			int ip = start;

			while (ip != 0)
			{
				int last = ip % 10;

				int fact = 1;
				for (int i = last; i != 0; i--)
				{
					fact *= i; 
				}

				sum += fact;

				ip /= 10;
			}

			if (sum == start)
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
