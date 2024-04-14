class AsciiCharacter 
{
	public static void main(String[] args) 
	{
		int ascii = 0;

		System.out.println("The Ascii characters are: ");

		while(ascii <= 127)
		{
			System.out.println((char)ascii);	
			ascii++;
		}
	}
}
