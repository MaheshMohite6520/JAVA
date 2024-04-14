class AlternateCharacters 
{
	public static void main(String[] args) 
	{
		System.out.println("Alternate characters are: ");

		for(char ch='A'; ch <= 'Z'; ch++)
		{
			System.out.println(ch);
			ch += 1;
		}
	}
}
