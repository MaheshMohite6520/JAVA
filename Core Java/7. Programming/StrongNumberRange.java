class StrongNumberRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		for (; start <= end; start++)
		{
			int sum = 0;

			for (int i = start; i > 0; i /= 10)
			{
				int last = i % 10;

				int fact = 1;
				for (int j = last; last > 0; last--)
				{
					fact *= last;
				}

				sum += fact;
			}

			if (start == sum)
			{
				System.out.println(start);
			}
		}
	}
}
