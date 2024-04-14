// Pronic Number is also known as Heteromecic Number.

import java.util.Scanner;

class PronicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		boolean ans = false;

		for (int i = 1; i <= num/2; i++)
		{
			if (i * (i+1) == num)
			{
				System.out.println(i + " * " + (i+1) + " = " + num);

				ans = true;
				break;
			}
		}

		if (ans == true)
		{
			System.out.println("It is a Pronic Number.");
		}

		else
		{
			System.out.println("It is not a Pronic Number.");
		}
	}
}
