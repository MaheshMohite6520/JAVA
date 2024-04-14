class BouncyNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isBouncy(101));
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
				increment = true;
			}
			else if (last < secondLast)
			{
				decrement = true;
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

		/*
		if (increment == true && decrement == true)
		{
			return true;
		}

		return false;
		*/

		return increment && decrement;
	}
}
