class FloatNarrowing 
{
	public static void main(String[] args) 
	{
		float f = 4543.8778f;

		long l = (long)f;				
		System.out.println(l);			// 4543

		int i = (int)f;					
		System.out.println(i);		    // 4543

		char c = (char)f;
		System.out.println(c);			// ?

		short s = (short)f;
		System.out.println(s);			// 4543

		byte b = (byte)f;
		System.out.println(b);			// -65
	}
}
