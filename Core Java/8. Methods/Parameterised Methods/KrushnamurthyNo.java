class KrushnamurthyNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isKrushnamurthy(145));
	}

	public static int fact(int num)
	{
		int fact = 1;

		for (int i = num; i > 0; i--)
		{
			fact *= i;
		}

		return fact;
	}

	public static boolean isKrushnamurthy(int num)
	{
		int sum = 0;

		int temp = num;
		while (temp != 0)
		{
			int last = temp % 10;
			sum += fact(last);
			temp /= 10;
		}

		return sum == num;
	}
}
