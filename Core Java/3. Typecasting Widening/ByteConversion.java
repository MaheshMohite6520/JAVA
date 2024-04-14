class ByteConversion 
{
	public static void main(String[] args) 
	{
		byte b = 100;

		short s = b;
		System.out.println(s);

		// char c = b;				// incompatible types: possible lossy conversion from byte to char
		// System.out.println(c);

		int i = b;
		System.out.println(i);

		long l = b;
		System.out.println(l);

		float f = b;
		System.out.println(f);

		double d = b;
		System.out.println(d);
	}
}
