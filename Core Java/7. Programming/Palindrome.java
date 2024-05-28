import java.util.Scanner;

class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		int reverse = 0;

		/*
		for(int temp = num; temp > 0; temp = temp / 10)
		{
			int last = temp % 10;
			reverse = reverse * 10 + last;
		}
		*/


		int temp = num;

		while (temp > 0)
		{
			int last = temp % 10;
			reverse = reverse * 10 + last;

			temp /= 10;
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
}
