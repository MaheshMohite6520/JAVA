class ArmstrongPrime 
{
	public static void main(String[] args) 
	{
		int num = 153;

		if (Utility.isArmstrong(num))
		{
			if (Utility.isPrime(num))
			{
				System.out.println("Armstrong Prime Number");
			}
			else
			{
				System.out.println("Armstrong Number but not Prime Number");
			}
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}
