import java.util.Scanner;

class EvilNo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter base value: ");
		int base = sc.nextInt();

		int num = 2342;
		int ct = 0;

		while (num != 0)
		{
			if (num % base == 1)
			{
				ct++;
			}
			num /= base;
		}

		if (ct >= 3)
		{
			System.out.println("Evil Number");
		}
		else
		{
			System.out.println("Not Evil Number");
		}
	}
}
