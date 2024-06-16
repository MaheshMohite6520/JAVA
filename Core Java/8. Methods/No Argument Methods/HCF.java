import java.util.Scanner;

class HCF 
{
	public static void main(String[] args) 
	{
		hcf();
	}

	public static void hcf()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int n2 = sc.nextInt();

		int min = n1 < n2 ? n1 : n2;

		while (true)
		{
			if (n1 % min == 0 && n2 % min == 0)
			{
				System.out.print("HCF of " + n1 + " & " + n2 + ": " + min);
				break;
			}
			min--;
		}
	}
}
