import java.util.Scanner;

class MultiplePrograms 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int denominator = 1;
		int sumOfFactors = 0;
		int sumOfDigits = 0;

		while(denominator <= num/2)
		{
			if(num % denominator == 0)
			{
				sumOfFactors += denominator;
			}
				
			denominator++;
		}

		if(sumOfFactors == num)
		{
			System.out.println(num + " is Perfect Number");

			int reverse = 0;

			for(int temp = num; temp > 0; temp = temp / 10)
			{
				int last = temp % 10;
				reverse = reverse * 10 + last;
			}

			if(num == reverse)
			{
				System.out.println(num + " is Palindrome Number.");
			}
			else
			{
				System.out.println(num + " is not Palindrome Number.");
			}

		}
		else
		{
			System.out.println(num + " is Not perfect number");

			while(num > 0)
			{
				int last = num % 10;
				sumOfDigits += last;
				num /= 10;
			}
			System.out.println("Sum of digits of number: " + sumOfDigits);
		}
	}
}
