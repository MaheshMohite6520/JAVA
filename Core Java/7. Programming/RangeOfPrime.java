class RangeOfPrime 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			int denominator = 2;

			while(denominator < start)
			{
				if(start % denominator == 0)
				{
					break;
				}
				denominator++;
			}

			if(start == denominator)
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
