class Power
{
	public static void main(String[] args) 
	{
		double base = 10;
		double raise = 0.5;

		System.out.println(power(base, raise));
	}

	public static double power(double base, double raise)
	{
		double pow = 1;

		for (double i = 0.1; i < raise; i++)
		{
			pow *= base;
		}

		return pow;
	}
}
