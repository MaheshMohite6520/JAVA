class Good 
{
	public static void main(String[] args) 
	{
		// System.out.println(Utility.isGood(12));

		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (Utility.isGood(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
