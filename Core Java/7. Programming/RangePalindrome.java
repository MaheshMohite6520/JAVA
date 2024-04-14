class RangePalindrome 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 100;


		while (start <= end)
		{
			int rev = 0;

			int temp = start;

			while (temp != 0)
			{
				int last = temp % 10;
				rev = rev * 10 + last;
				temp /= 10;
			}

			if (start == rev)
			{
				System.out.println(start);
			}

			start++;
		}
	}
}
