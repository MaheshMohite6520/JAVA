class IntConversion 
{
	public static void main(String[] args) 
	{
		
		int i = 500;

		// byte b = i;				//  incompatible types: possible lossy conversion from int to byte
		// System.out.println(b);

		// short s = i;				// incompatible types: possible lossy conversion from int to short
		// System.out.println(s);

		// char c = i;				// incompatible types: possible lossy conversion from int to char
		// System.out.println(c);

		long l = i;
		System.out.println(l);

		float f = i;
		System.out.println(f);

		double d = i;
		System.out.println(d);

	}
}
