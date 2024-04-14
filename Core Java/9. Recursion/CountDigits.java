class CountDigits 
{
	public static void main(String[] args) 
	{
		System.out.println(countDigits(123111));
	}

	public static int countDigits(int num) 
	{
		int count = 0;

		if (num == 0) 
		{
			return 0;
		} 
		else
		{
			return 1 + countDigits(num / 10);
		}
	}
}
