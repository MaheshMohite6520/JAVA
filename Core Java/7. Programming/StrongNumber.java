class StrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 145;
		int sum = 0;

		for (int ip = num; ip > 0; ip /= 10)
		{
			int last = ip % 10;

			int fact= 1;
			for (int i = last; i > 0; i--)
			{
				fact *= i;
			}

			sum += fact;
		}

		if (num == sum)
		{
			System.out.println("It is a strong number");
		}

		else
		{
			System.out.println("It is not a strong number");
		}
	}
}
