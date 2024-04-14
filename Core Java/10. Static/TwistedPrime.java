class TwistedPrime 
{
	public static void main(String[] args) 
	{
		// System.out.println(Utility.isTwistedPrime(31));

		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (Utility.isTwistedPrime(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
