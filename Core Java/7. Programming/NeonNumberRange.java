class NeonNumberRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 10000;

		while (start <= end)
		{
			int square = start * start;

			int sum = 0;

			while (square != 0)
			{
				int last = square % 10;

				sum += last;

				square /= 10;
			}

			if (start == sum)
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
