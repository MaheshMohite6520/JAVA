import java.util.Scanner;

class CheckFibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;

		for( ; ; )
		{
			if(n2 == num)
			{
				System.out.println("It is a fibonacci number");
				break;
			}
			else if(n1 > num)
			{
				System.out.println("It is not a fibonacci number");
				break;
			}
			else
			{
				n3 = n1 + n2;

				n1 = n2;
				n2 = n3;
			}
		}
	}
}
