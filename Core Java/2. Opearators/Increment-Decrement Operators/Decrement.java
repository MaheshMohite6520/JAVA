class Decrement 
{
	public static void main(String[] args) 
	{
		int pocket = 100;

		System.out.println(--pocket);				// 99
		System.out.println(--pocket);				// 98
		System.out.println(pocket--);				// 98
		System.out.println(--pocket);				// 96
		System.out.println(pocket--);				// 96
		System.out.println(--pocket + pocket--);	// 188
		System.out.println(pocket);					// 93
		System.out.println(pocket-- - --pocket);	// 2
		System.out.println(pocket);					// 91
	}
}
