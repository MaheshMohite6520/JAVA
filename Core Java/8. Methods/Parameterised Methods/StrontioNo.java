class StrontioNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isStrontio(1221));
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

	public static boolean isStrontio(int num)
	{
		int ct = count(num);

		if (ct == 4)
		{
			int ans = num * 2;
			ans /= 10;

			int tenth = ans % 10;
			ans /= 10;

			int thousand = ans % 10;

			if (tenth == thousand)
			{
				return true;
			}
		}

		return false;
	}
}