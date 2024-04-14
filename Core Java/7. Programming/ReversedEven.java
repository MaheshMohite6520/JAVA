import java.util.Scanner;

class ReversedEven
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num % 2 != 0)
		{
			System.out.println(num + " is Odd Number");
		}
		else
		{
			int reverse = 0;

			while(num > 0)
			{
				int last = num % 10;
				reverse = reverse * 10 + last;
				num /= 10;
			}

			if(reverse % 2 == 0)
			{
				System.out.println(reverse + " is Twisted-Even Number.");
			}
			else
			{
				System.out.println(reverse + " is not Twisted-Even Number.");
			}		
		}
	}
}
