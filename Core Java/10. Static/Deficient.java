class Deficient 
{
	public static void main(String[] args) 
	{
		int num = 8;

		if (Utility.sumOfFactor(num) < num)
		{
			System.out.println("Deficient Number");
		}
		else
		{
			System.out.println("Not Deficient Number");
		}
	}
}
