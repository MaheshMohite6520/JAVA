class RangeBouncyNo 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (isBouncy(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isBouncy(int num)
	{
		boolean increment = false;
		boolean decrement = false;

		int last = num % 10;

		while (num > 9)
		{
			num /= 10;
			int secondLast = num % 10;

			if (last > secondLast)
			{
				decrement = true;
			}
			else if (last < secondLast)
			{
				increment = true;
			}

			if (increment == true && decrement == true)
			{
				break;
			}
			else
			{
				last = secondLast;
			}
		}

		return increment == decrement;
	}
}
