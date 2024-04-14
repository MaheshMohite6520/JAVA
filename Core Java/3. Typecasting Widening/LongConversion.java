class LongConversion 
{
	public static void main(String[] args) 
	{
		long l = 5000000;

		// byte b = l;				// incompatible types: possible lossy conversion from long to byte
		// System.out.println(b);

		// short s = l;				// incompatible types: possible lossy conversion from long to short
		// System.out.println(s);

		// char c = l;				// incompatible types: possible lossy conversion from long to char
		// System.out.println(c);

		// int i = l;				//  incompatible types: possible lossy conversion from long to int
		// System.out.println(i);

		float f = l;
		System.out.println(f);

		double d = l;
		System.out.println(d);
	}
}
