class PrintReverseAlphabet 
{
	public static void main(String[] args) 
	{
		char ch = 'Z';

		System.out.println("The reverse alphbets are: ");
		do
		{
			System.out.println(ch);
			ch--;
		}
		while (ch >= 'A');
	}
}
