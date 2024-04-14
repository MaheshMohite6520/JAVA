import java.util.Scanner;

class Table 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		int count = 1;

		System.out.println("The table of " + number + " is: ");

		while(count <= 10)
		{
			System.out.println(number * count);
			++count;
		}
	}
}
