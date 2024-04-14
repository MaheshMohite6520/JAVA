class OctalToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println(octToDec(217));
	}

	public static int octToDec(int num)
	{
		int sum = 0;
		int i = 0;

		while (num != 0)
		{
			int last = num % 8;
			sum += last * power(8, i);
			num /= 8;
			i++;
		}

		return sum;
	}

	public static int power(int base, int raise)
	{
		int pow = 1;
		
		for (int i = raise; i > 0; i--)
		{
			pow *= base;
		}

		return pow;
	}
}
