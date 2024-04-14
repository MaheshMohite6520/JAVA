class Divide2 
{
	public static void main(String[] args) 
	{
		int start = 150;
		int end = 750;

		while(start <= end)
		{
			if((start / 3) * 3 == start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}


// Note : Divide the number by n and then multiply by n. if answer is same as number then number is divisible by n;