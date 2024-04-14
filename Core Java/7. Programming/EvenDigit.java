import java.util.Scanner;

class EvenDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Even digits in number " + num + " are: ");
		while(num > 0)
		{
			int rem = num % 10;

			if(rem % 2 == 0) 
			{
				System.out.println(rem);
			}

			num /= 10;
		}
	}
}
