class RangeAbundantNo 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isAbundant(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isAbundant(int num)
	{
		int sum = 0;

		for (int i = 1; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}

		if (sum > num)
		{
			return true;
		}

		return false;
	}
}
