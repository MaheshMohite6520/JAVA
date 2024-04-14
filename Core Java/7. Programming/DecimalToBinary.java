class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		System.out.println(decToBin(143));
	}

	public static String decToBin(int num)
	{
		String ans = "";

		while (num != 0)
		{
			int last = num % 2;
			ans = last + ans;
			num /= 2;
		}

		return ans;
	}
}
