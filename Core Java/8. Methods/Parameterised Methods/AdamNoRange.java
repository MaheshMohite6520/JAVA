class AdamNoRange 
{
	public static void main(String[] args) 
	{
		// 0 is also Adam Number.	
		int start = 0;
		int end = 1000;

		while (start <= end)
		{
			if (isAdam(start))
			{
				System.out.println(start);
			}

			start++;
		}
	}

	public static int reverse(int num)
	{
		int rev = 0;

		while (num != 0)
		{
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}

		return rev;
	}

	public static boolean isAdam(int num)
	{
		int square = num * num;
		int rev = reverse(num);

		int revSquare = rev * rev;

		int numSquareRev = reverse(square);

		return numSquareRev == revSquare;
	}
}
