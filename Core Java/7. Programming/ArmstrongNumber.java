class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 153;

		int sum = 0;
		int count = 0;

		for (int i = num; i != 0; i /= 10)
		{
			count++;
		}

		for (int i = num; i != 0; i /= 10)
		{
			int last = i % 10;

			int pow = 1;
			for (int j = 0; j < count; j++)
			{
				pow *= last;
			}

			sum += pow;
		}

		if (sum == num)
		{
			System.out.println("It is a Armstrong Number.");
		}
		else
		{
			System.out.println("It is not a Armstrong Number.");
		}
	}
}
