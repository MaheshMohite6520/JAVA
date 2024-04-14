class AsciiCharacter 
{
	public static void main(String[] args) 
	{
		int ascii = 0;

		System.out.println("The ASCII Characters are: ");
		do
		{
			System.out.println(ascii + ". " + (char)ascii);	
			ascii++;
		}
		while(ascii <= 127);
	}
}
