class HappyNo
{
	public static void main(String[] args) 
	{
		System.out.println(isHappy(19));

		// isHappy(5);
	}

	public static int squareDigitSum(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += last * last;
			num /= 10;
		}

		return sum;
	}


	public static boolean isHappy(int num)
	{
		while (true)
		{
			num = squareDigitSum(num);

			if (num == 1 || num == 4)
			{
				break;
			}
		}

		return num == 1;
	}


	/*
	public static void isHappy(int num)
	{
		while (true)
		{
			num = squareDigitSum(num);

			if (num == 1 || num == 4)
			{
				break;
			}
		}

		if (num == 1)
		{
			System.out.println("Happy Number");
		}
		else if (num == 4)
		{
			System.out.println("Sad Number");
		}
		else
		{
			System.out.println("Not Happy Number");
		}
	}
	*/
}
