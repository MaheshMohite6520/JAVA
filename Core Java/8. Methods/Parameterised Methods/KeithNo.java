class KeithNo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

	public static boolean iskeith(int num)
	{
		int temp = num;
		int sum = 0;

		while (temp != 0)
		{
			int last = temp % 10;
			sum += last;
			num /= 10;
		}
	}
}
