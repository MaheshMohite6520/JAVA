class LucasNo 
{
	public static void main(String[] args) 
	{
		System.out.println(lucas(5));
	}

	public static int lucas(int num)
	{
		if (num == 1)
		{
			return 2;
		}
		if (num == 2)
		{
			return 1;
		}

		int n1 = 2, n2 = 1, n3;
		
		while (num > 2)
		{
			n3 = n1 + n2;

			n1 = n2;
			n2 = n3;
			num--;
		}

		return n2;
	}
}
