class MistryNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isMistry(110));
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

	public static boolean isMistry(int num)
	{
		int start = 11;

		while (start < num/2)
		{
			int rev = reverse(start);
			int ans = start + rev;

			if (num == ans)
			{
				return true;
			}
			else
			{
				start++;
			}
		}

		return false;
	}
}
