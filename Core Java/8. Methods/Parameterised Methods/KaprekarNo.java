class KaprekarNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isKaprekar(5292));
	}

	public static boolean isKaprekar(int num)
	{
		int square = num * num;

		int ct = count(square);

		int sum = 0;

		for (int i = 1; i < ct; i++)
		{
			int last = num % power(10, ct/2);
			int first = num / power(10, ct/2);

			sum = last + first;
		}

		return sum == num;
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
}
