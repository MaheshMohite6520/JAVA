class RangeLucasNo 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 100;

		while (start <= end)
		{
			if (isLucas(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static boolean isLucas(int num)
	{
		int n1 = 2, n2 = 1, n3;
		
		while (num > 2)
		{
			n3 = n1 + n2;

			if (n1 == num)
			{
				return true;
			}

			n1 = n2;
			n2 = n3;
			num--;
		}

		return false;
	}
}
