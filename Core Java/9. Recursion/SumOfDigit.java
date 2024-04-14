class SumOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(123));
	}

	public static int sum(int num)
	{
		if (num == 0)
		{
			return 0;
		}
		else
		{
			return num % 10 + sum(num / 10);
		}
	}
}
