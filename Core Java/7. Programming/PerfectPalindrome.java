import java.util.Scanner;

class PerfectPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int denominator = 1;
		int sum = 0;

		while(denominator <= num/2)
		{
			if(num % denominator == 0)
			{
				sum += denominator;
			}
				
			denominator++;
		}

		if(sum == num)
		{
			System.out.println(num + " is Perfect Number.");

			int reverse = 0;

			for(int temp = num; temp > 0; temp = temp / 10)
			{
				int last = temp % 10;
				reverse = reverse * 10 + last;
			}

			if(num == reverse)
			{
				System.out.println(num + " is Palindrome Number");
			}
			else
			{
				System.out.println(num + " is not Palindrome Number");
			}

		}
		else
		{
			System.out.println(num + " is Not Perfect Number");

			int ip = num;
			int digitSum = 0;

			while(ip != 0)
			{
				int last = ip % 10;
				digitSum += last;
				ip /= 10;
			}
			System.out.println("Sum of digits of number: " + digitSum);
		}
	}
}
