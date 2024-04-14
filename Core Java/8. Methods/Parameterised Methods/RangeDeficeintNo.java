class RangeDeficeintNo
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isDeficeint(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isDeficeint(int num)
	{
		int den = 1;
		int sum = 0;

		int temp = num;

		for(int i = 1; i<= temp; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}

		if (sum < num * 2)
		{
			return true;
		}

		return false;
	}
}
