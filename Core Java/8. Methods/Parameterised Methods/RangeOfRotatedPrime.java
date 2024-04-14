class RangeOfRotatedPrime
{
	public static void main(String[] args)
	{
		int start = 1;
		int end = 10000;

		while (start <= end)
		{
			int temp = start;

			if (isPrime(temp))
			{
				temp = rotate(temp);

				while (temp != start)
				{
					if (isPrime(temp))
					{
						temp = rotate(temp);
					}
					else
					{
						break;
					}
				}

				if (temp == start)
				{
					System.out.println(start);
				}
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

	public static boolean isPrime(int num)
	{
		int i;
		for (i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				break;
			}
		}

		return num == i;
	}

	public static int rotate(int num)
	{
		return (num % 10) * power(10, count(num)-1) + (num / 10);
	}
}
