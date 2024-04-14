class PellNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isPell(10));
	}

	public static int isPell(int num)
	{
		if (num == 1)
		{
			return 0;
		}
		else if (num == 2)
		{
			return 1;
		}
		else
		{
			int n1 = 0;
			int n2 = 1;

			for (int i = 3; i <= num; i++)
			{
				int n3 = 2 * n2 + n1;

				n1 = n2;
				n2 = n3;
			}

			return n2;
		}
	}
}
