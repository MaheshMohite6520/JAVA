class SmithNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isSmith(start))
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

	public static boolean isSmith(int num)
	{
		int digitSum = sumOfDigits(num);

		int factorDigit = 0;

		int den = 2;
		while (num != 1)
		{
			if (num % den == 0)
			{
				num /= den;

				if (isPrime(den))
				{
					factorDigit += sumOfDigits(den);
					den = 2;
				}
			}
			else
			{
				den++;
			}
		}

		return digitSum == factorDigit;
	}
}
