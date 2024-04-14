import java.util.Scanner;

class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int square = num * num;

		int sum = 0;

		while (square != 0)
		{
			int last = square % 10;
			sum += last;
			square /= 10;
		}

		if (num == sum)
		{
			System.out.println("It is a Neon Number.");
		}
		else
		{
			System.out.println("It is not a Neon Number.");
		}
	}
}
