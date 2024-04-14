class RangeNivenNo 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isNiven(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static int sumOfDigits(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += last;
			num /= 10;
		}

		return sum;
	}

	public static boolean isNiven(int num)
	{
		int sum = sumOfDigits(num);

		if (num % sum == 0)
		{
			return true;
		}

		return false;
	}
}
