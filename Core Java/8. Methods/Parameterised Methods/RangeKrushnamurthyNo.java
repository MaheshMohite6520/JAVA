class RangeKrushnamurthyNo 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isKrushnamurthy(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static int fact(int num)
	{
		int fact = 1;

		for (int i = num; i > 0; i--)
		{
			fact *= i;
		}

		return fact;
	}

	public static boolean isKrushnamurthy(int num)
	{
		int sum = 0;

		int temp = num;
		while (temp != 0)
		{
			int last = temp % 10;
			sum += fact(last);
			temp /= 10;
		}

		return sum == num;
	}
}
