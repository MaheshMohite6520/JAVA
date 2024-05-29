// Static Blocks

class StaticBlock1 
{
	static 
	{
		System.out.println("From Static Slock-1");
	}

	public static void main(String[] args) 
	{
		System.out.println("from main()");
	}
	
	static
	{
		System.out.println("From Static Block-2");
	}

	static
	{
		System.out.println("From Static Block-3");
	}
}
