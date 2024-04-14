class SunnyNoRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 10000;

		while (start <= end)
		{
			if (isSunny(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isSunny(int num)
	{
		int nextNum = num + 1;

		int i;
		for (i = 1; ; i++)
		{
			if (nextNum == i * i)
			{
				break;
			}
			else if (i * i > nextNum)
			{
				break;
			}
			else
			{
				i++;
			}
		}

		if (nextNum == i * i)
		{
			return true;
		}

		return false;
	}
}
