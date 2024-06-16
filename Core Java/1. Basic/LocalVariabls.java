class LocalVariabls
{
	public static void main(String[] args) 
	{
		{
			double d = 547.634;
			System.out.println(d);

			// char d = 'M';			// Compile Time Error : We can;t declare a same variable name in same block
			// System.out.println(d);
		}

		{
			char d = 'M';
			System.out.println(d);
		}

		{
			// boolean b ;				// Compile Time Error : We can't use a variable without daclaring it
			// System.out.println(b);
		}
	}
}
