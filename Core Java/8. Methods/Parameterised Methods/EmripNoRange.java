class EmripNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isEmrip(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static int reverse(int num)
	{
		int rev = 0;

		while (num != 0)
		{
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}

		return rev;
	}

	public static boolean isPrime(int num)
	{
		int den;
		for (den = 2; den < num; den++)
		{
			if (num % den == 0)
			{
				break;
			}
		}

		return num == den;
	}

	public static boolean isEmrip(int num)
	{
		int rev = reverse(num);

		if (isPrime(num) && isPrime(rev))
		{
			return true;
		}

		return false;
	}
}
