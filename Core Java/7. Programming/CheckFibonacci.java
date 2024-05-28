import java.util.Scanner;

class CheckFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;

		for( ; ; )
		{
			if(n2 == num)
			{
				System.out.println("It is a Fibonacci Number.");
				break;
			}
			else if(n1 > num)
			{
				System.out.println("It is not a Fibonacci Number.");
				break;
			}
			else
			{
				n3 = n1 + n2;

				// SWAP
				n1 = n2;
				n2 = n3;
			}
		}
	}
}
