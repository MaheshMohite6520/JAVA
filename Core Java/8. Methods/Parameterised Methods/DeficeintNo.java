class DeficeintNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isDeficeint(21));
	}

	public static boolean isDeficeint(int num)
	{
		int den = 1;
		int sum = 0;

		int temp = num;

		for(int i = 1; i<= temp/2; i++)
		{
			if(num % i == 0)
			{
				sum += i;
			}
		}

		if (sum < num)
		{
			return true;
		}

		return false;
	}
}
