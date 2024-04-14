class ShortConversion 
{
	public static void main(String[] args) 
	{
		short s = 150;

		// byte b = s;				// incompatible types: possible lossy conversion from short to byte
		// System.out.println(b);

		// char c = s;				 // incompatible types: possible lossy conversion from short to char
		// System.out.println(c);

		int i = s;
		System.out.println(i);

		long l = s;
		System.out.println(l);

		float f = s;
		System.out.println(f);

		double d = s;
		System.out.println(d);
	}
}
