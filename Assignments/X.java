class X 
{
	static
	{
		a = 10;
	}

	static int a = 20;

	int b = 30;

	public static void main(String[] args) 
	{
		X x = new X();
		System.out.println("Z: " + a * x.a);
	}
}
