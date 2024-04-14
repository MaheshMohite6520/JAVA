class KaprekarNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 10000;

		while (start <= end)
		{
			if (isKaprekar(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isKaprekar(int num)
	{
		int square = num * num;

		int ct = count(square);

		int last = square % power(10, ct/2);
		int first = square / power(10, ct/2);

		int sum = last + first;

		return sum == num;
	}

	public static int count(int num)
	{
		int ct = 0;

		while (num != 0)
		{
			ct++;
			num /= 10;
		}

		return ct;
	}

	public static int power(int base, int count)
	{
		int pow = 1;

		for (int i = count; i > 0; i--)
		{
			pow *= base;
		}

		return pow;
	}
}
