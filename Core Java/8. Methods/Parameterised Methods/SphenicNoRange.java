class SphenicNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isSphenic(start))
			{
				System.out.println(start);
			}

			start++;
		}
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

	public static boolean isSphenic(int num)
	{
		int product = 1;

		for (int i = 1; i < num; i++)
		{
			if (num % i == 0)
			{
				if (isPrime(i))
				{
					product *= i;
				}
			}
		}

		return product == num;
	}
}
