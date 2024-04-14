class TechNumber 
{
	public static void main(String[] args) 
	{
		int num = 81;

		int ans = 0;
		int add = 0;

		int ct = count(num);

		if (ct % 2 == 0)
		{
			int last = num % power(10, ct/2);
			int first = num / power(10, ct/2);

			add = first + last;

			ans = add * add;
		}

		if (num == ans)
		{
			System.out.println("It is a Tech Number.");
		}
		else
		{
			System.out.println("It is not a Tech Number.");
		}
	}

	public static int count(int num)
	{
		int ct = 0;

		while (num != 0)
		{
			ct++;
			num /= 10;
		}

		return ct;
	}

	public static int power(int base, int raise)
	{
		int pow = 1;

		for (int i = raise; i > 0; i--)
		{
			pow *= base;
		}

		return pow;
	}
}
