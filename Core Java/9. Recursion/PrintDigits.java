class PrintDigits 
{
	public static void main(String[] args) 
	{
		printDigit(1234);
	}

	public static void printDigit(int num)
	{
		if (num != 0)
		{
			System.out.println(num % 10);
			num /= 10;
			printDigit(num);
		}
		else
		{
			return;
		}
	}
}
