import java.util.Scanner;

class SumOfSquareOFDigitOFnumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;

		while (num != 0)
		{
			int last = extractDigit(num);
			sum = sum + square(last);
			num /= 10;
		}

		System.out.println(sum);
	}

	public static int extractDigit(int num)
	{
		int last = num % 10;
		return last;
	}

	public static int square(int num)
	{
		int square = num * num;
		return square;
	}
}
