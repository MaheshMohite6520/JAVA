class UglyNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isUgly(16));
	}

	public static boolean isUgly(int num)
	{
		int den = 2;

		while (num != 1)
		{
			if (num % den == 0)
			{
				if (den == 2 || den == 3 || den == 5)
				{
					num /= den;
					den = 2;
				}
				else
				{
					return false;
				}
			}
			else
			{
				den++;
			}
		}

		return true;
	}
}
