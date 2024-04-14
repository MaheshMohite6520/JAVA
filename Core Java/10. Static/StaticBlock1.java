class StaticBlock1 
{
	static 
	{
		System.out.println("From static block-1");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main()");
	}
	
	static
	{
		System.out.println("From static block-3");
	}
	static
	{
		System.out.println("From static block-2");
	}
}
