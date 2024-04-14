class LongNarrowing 
{
	public static void main(String[] args) 
	{
		long l = 6536285l;

		int i = (int)l;					
		System.out.println(i);		    // 6536285

		char c = (char)l;
		System.out.println(c);			// ?

		short s = (short)l;
		System.out.println(s);			// -17315

		byte b = (byte)l;
		System.out.println(b);			// 93
	}
}
