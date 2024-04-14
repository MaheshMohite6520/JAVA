import java.util.Scanner;

class Fibonacci 
{
	public static void main(String[] args) 
	{
		fibo();
	}

	public static void fibo()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int n1 = 0, n2 = 1, n3;

		for (int i = 0; i < num; i++)
		{
			n3 = n2 + n1;
			System.out.println(n1);

			n1 = n2;
			n2 = n3;
		}
	}
}
