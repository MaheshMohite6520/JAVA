import java.util.Scanner;

class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();

		int max = n1 > n2 ? n1 : n2;

		int i = 1;

		// Optimised way

		while(true)
		{
			if ((max*i) % n1 == 0 && (max*i) % n2 == 0)
			{
				System.out.println("The LCM of " + n1 + " & " + n2 + " is: " + (max*i));
				break;
			}

			i++;
		}
		

		/*
		while (true)
		{
			if (max % n1 == 0 && max % n2 == 0)
			{
				System.out.println("The LCM of " + n1 + " & " + n2 + " is: " + max);
				break;
			}

			max++;
		}
		*/
	}
}
