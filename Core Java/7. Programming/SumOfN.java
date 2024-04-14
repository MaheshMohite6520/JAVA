import java.util.Scanner;

class SumOfN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int start = 1;

		/*
		int sum = 0;
		while(start <= n)
		{
			sum += start;
			start++;
		}
		*/

		int sum = n*(n+1) / 2;

		System.out.println("Sum of 1 to " + n + " numbers: " + sum);
	}
}
