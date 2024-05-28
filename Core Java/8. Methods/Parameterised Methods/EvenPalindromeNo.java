import java.util.Scanner;

class EvenPalindromeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int ip = sc.nextInt();

		int rev = reverse(ip);

		if (isPalindrome(ip, rev))
		{
			if (isEven(rev))
			{
				System.out.println("Even Palindrome-Number");
			}
			else
			{
				System.out.println("Palindrome Number but Not Even Palindrome-Number");
			}
		}
		else
		{
			System.out.println("Not Palindrome-Number");
		}
	}

	public static int reverse(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		return rev;
	}

	public static boolean isPalindrome(int ip, int rev)
	{
		return ip == rev;
	}

	public static boolean isEven(int num)
	{
		return num % 2 == 0;
	}
}
