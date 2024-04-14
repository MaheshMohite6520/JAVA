class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println(binToDec(10001111));
	}

	public static int binToDec(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += last * power(2, i);
			num /= 10;
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
