class GoodNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isGood(40));
	}

	public static boolean isGood(int num)
	{
		int temp = num ;

		while (temp != 0)
		{
			int last = temp % 10;

			if (last == 0 || num % last == 0)
			{
				temp /= 10;
			}
			else
			{
				return false;
			}
		}

		return true;
	}
}
