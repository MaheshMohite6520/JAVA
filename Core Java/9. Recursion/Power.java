class Power 
{
	public static void main(String[] args) 
	{
		System.out.println(power(10, 3));
	}

	public static int power(int base, int raise)
	{
		if (raise == 0)
		{
			return 1;
		}
		else
		{
			return base * power(base, raise - 1);
		}
	}
}
