class Increment 
{
	public static void main(String[] args) 
	{
		int pocket = 100;

		System.out.println(++pocket);				// 101
		System.out.println(++pocket);				// 102
		System.out.println(pocket++);				// 102
		System.out.println(++pocket);				// 104
		System.out.println(pocket++);				// 104
		System.out.println(++pocket + pocket++);	// 212
		System.out.println(pocket);					// 107
		System.out.println(pocket++ - ++pocket);	// -2
		System.out.println(pocket);					// 109
	}
}
