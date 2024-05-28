import java.util.Scanner;

class FibonacciDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean isAllFibo = true;

		while(num != 0)
		{
			int last = num % 10;

			if (!(last == 0 || last == 1 || last == 2 || last == 3 || last == 5 || last == 8))
			{
				isAllFibo = false;
				break;
			}

			num /= 10;
		}

		if(isAllFibo)
		{
			System.out.println("It contains all Fibonacci Digits.");
		}
		else
		{
			System.out.println("It does not contains all Fibonacci Digits.");
		}

		
		
	}
}
