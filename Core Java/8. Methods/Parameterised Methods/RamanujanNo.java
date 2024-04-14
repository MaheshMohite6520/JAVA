class RamanujanNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isRamanujan(1458));
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

	public static int reverse(int num)
	{
		int rev = 0;

		while (num != 0)
		{
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}

		return rev;
	}

	public static boolean isRamanujan(int num)
	{
		int sum = sumOfDigits(num);
		int rev = reverse(sum);

		int ans = sum * rev;

		return num == ans;
	}
}
