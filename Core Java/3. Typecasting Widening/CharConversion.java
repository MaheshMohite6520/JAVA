class CharConversion 
{
	public static void main(String[] args) 
	{
		char c = 'A';

		// byte b = c;				// incompatible types: possible lossy conversion from char to byte
		// System.out.println(b);

		// short s = c;				// incompatible types: possible lossy conversion from char to short
		// System.out.println(s);

		int i = c;
		System.out.println(i);

		long l = c;
		System.out.println(l);

		float f = c;
		System.out.println(f);

		double d = c;
		System.out.println(d);
	}
}
