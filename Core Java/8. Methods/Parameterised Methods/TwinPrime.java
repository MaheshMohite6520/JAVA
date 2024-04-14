class TwinPrime 
{
	public static void main(String[] args)
	{
		int start = 1;
		int end = 1000;

		int prime1 = returnPrime(start);

		for (int i = prime1; i <= end; )
		{
			int prime2 = returnPrime(i + 1);

			if(prime2 - prime1 <= 2)
			{
				System.out.println(prime1 + "," + prime2);
			}

			prime1 = prime2;
			i = prime2;
		}
	}

	public static int returnPrime(int num)
	{
		for (int i = num; ; i++)
		{
			int den;
			for (den = 2; den < i; den++)
			{
				if (i % den == 0)
				{
					break;
				}
			}

			if (i == den)
			{
				return i;
			}
		}
	}
}
