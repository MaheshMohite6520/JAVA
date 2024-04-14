class DoubleNarrowing 
{
	public static void main(String[] args) 
	{
		double d = 1243.4578456;

		// float f = d;
		// System.out.println(f);		//  incompatible types: possible lossy conversion from double to float

		float f = (float)d;				
		System.out.println(f);			// 1243.4579

		long l = (long)d;				
		System.out.println(l);			// 1243

		int i = (int)d;					
		System.out.println(i);		    // 1243

		char c = (char)d;
		System.out.println(c);			// ?

		short s = (short)d;
		System.out.println(s);			// 1243

		byte b = (byte)d;
		System.out.println(b);			// -37
	}
}
