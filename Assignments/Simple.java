class Simple 
{
	static int a,b = 20;

	static void getData()
	{
		System.out.println("a: " + a);
	}

	static void display()
	{
		System.out.println("b: " + b);
	}

	static
	{
		System.out.println("Samsung Mobile");
	}

	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(b);
	}
}