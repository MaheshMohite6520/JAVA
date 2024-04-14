import java.util.Scanner;

class PalindromeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int ip = sc.nextInt();	

		int rev = reverse(ip);

		System.out.println(isPalindrome(ip, rev));
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
}
