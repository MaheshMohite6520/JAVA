class ArmStrong 
{
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153));
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

	public static int power(int rem, int count)
	{
		int pow = 1;

		for (int i = count; i > 0; i--)
		{
			pow *= rem;
		}

		return pow;
	}

	public static boolean isArmstrong(int num)
	{
		int ct = count(num);

		int sum = 0;

		for (int i = num; i != 0; i /= 10)
		{
			int rem = i % 10;
			sum = sum + power(rem, ct);
		}

		return sum == num;
	}
}
