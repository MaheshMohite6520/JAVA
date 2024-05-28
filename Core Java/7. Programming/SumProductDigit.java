import java.util.Scanner;

class SumProductDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int sum = 0;
		int product = 1;

		while(num > 0)
		{
			int last = num % 10;

			sum += last;
			product *= last;

			num /= 10;
		}

		System.out.println("Sum of digits of number is: " + sum);
		System.out.println("Product of digits of number is: " + product);


		if(sum == product)
		{
			System.out.println("Sum of Digits & Product of number is Same.");
		}
		System.out.println("Sum of Digits & Product of number is Not Same.");
	}
}
