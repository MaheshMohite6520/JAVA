class EvilNo 
{
	public static void main(String[] args)
	{
		// System.out.println(Utility.isEvil(15));

		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (Utility.isEvil(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
