import java.util.Scanner;

class IfElse2 
{
	public static void main(String[] args) 
	{
		Scanner xc = new Scanner(System.in);
		System.out.print("Enter the amount to transfer: ");

		double amount = xc.nextDouble();

		double limit = 20000;

		if(amount <= limit)
		{
			System.out.println("Amount can be transfer.");
		}
		else
		{
			System.out.println("Transaction limit is 20000 Rs. Amount cannot be transfer.");
		}
	}
}
