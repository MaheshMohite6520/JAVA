import java.util.Scanner;

class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int n1 = 0, n2 = 1, n3;

		System.out.println("The first " + n + " fibonacci numbers are: ");
		for(int i = 0; i < n; i++)
		{
			n3 = n1 + n2;
			System.out.println(n1);

			n1 = n2;
			n2 = n3;
		}
	}
}