class  FloatConversion
{
	public static void main(String[] args) 
	{
		float f = 897.2343f;

		// byte b = f;				//  incompatible types: possible lossy conversion from float to byte
		// System.out.println(b);

		// short s = f;				//  incompatible types: possible lossy conversion from float to short
		// System.out.println(s);

		// char c = f;				// incompatible types: possible lossy conversion from float to char
		// System.out.println(c);

		// int i = f;				//  incompatible types: possible lossy conversion from float to int
		// System.out.println(i);

		// long l = f;				// incompatible types: possible lossy conversion from float to long
		// System.out.println(l);

		double d = f;
		System.out.println(d);
	}
}
