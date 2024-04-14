class StaticBlock4 
{
	static double d;

	static	
	{
		double d = 123.123;
		d = test() + demo(d);
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		System.out.println(d);
	}

	public static double test()
	{
		return d * d;
	}

	public static double demo(double num)
	{
		d = num;
		return num + num;
	}
}
