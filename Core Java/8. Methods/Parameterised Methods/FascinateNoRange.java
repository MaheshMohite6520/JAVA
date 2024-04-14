class FascinateNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isFascinate(start))
			{
				System.out.println(start);
			}

			start++;
		}
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

	public static boolean isUnique(int num)
	{
		while (num != 0)
		{
			int last = num % 10;
			num /= 10;

			int temp = num;
			while (temp != 0)
			{
				if (last == temp % 10)
				{
					return false;
				}

				temp /= 10;
			}
		}

		return true;
	}

	public static boolean isFascinate(int num)
	{
		int num1 = num * 2;
		int num2 = num * 3;

		int num1ct = count(num1);
		int num2ct = count(num2);

		int ans1 = num * power(10, num1ct) + num1;
		int ans2 = ans1 * power(10, num2ct) + num2;

		if (isUnique(ans2))
		{
			return true;
		}

		return false;
	}
}
