import java.util.Scanner;

class Factor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println("Factors of " + num + " are: ");

		for(int i = 1; i<= num/2; i++)
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
		System.out.println(num);
	}
}
