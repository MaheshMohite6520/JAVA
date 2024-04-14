class CharNarrowing 
{
	public static void main(String[] args) 
	{
		char c = 'M';

		short s = (short)c;
		System.out.println(s);			// 77

		byte b = (byte)c;
		System.out.println(b);			// 77
	}
}
