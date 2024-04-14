class NivenNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isNiven(9));
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

	public static boolean isNiven(int num)
	{
		int sum = sumOfDigits(num);

		if (num % sum == 0)
		{
			return true;
		}

		return false;
	}
}
