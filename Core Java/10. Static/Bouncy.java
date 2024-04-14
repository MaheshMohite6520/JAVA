class Bouncy 
{
	public static void main(String[] args) 
	{
		// System.out.println(Utility.isBouncy(1232));

		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (Utility.isBouncy(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
