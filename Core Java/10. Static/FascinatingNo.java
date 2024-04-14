class FascinatingNo 
{
	public static void main(String[] args) 
	{
		// System.out.println(Utility.isFascinating(192));

		int start = 1;
		int end = 1000;

		while (start <= end)
		{
			if (Utility.isFascinating(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
