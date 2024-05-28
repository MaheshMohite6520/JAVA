class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println(binToDec(1010));
	}

	public static int binToDec(int num)
	{
		int sum = 0;
		int i = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += last * power(2, i);
			
			i++;
			num /= 10;
		}

		return sum;
	}

	public static int power(int base, int raise)
	{
		int pow = 1;

		for (int i = raise; i != 0; i--)
		{
			pow *= base;
		}

		return pow;
	}
}
