class DigitProduct 
{
	public static void main(String[] args) 
	{
		System.out.println(product(23));
	}

	public static int product(int num)
	{
		if (num == 0)
		{
			return 1;
		}
		else
		{
			return num % 10 * product(num / 10);
		}
	}
}
