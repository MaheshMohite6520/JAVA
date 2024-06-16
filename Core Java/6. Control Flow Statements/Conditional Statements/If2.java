import java.util.Scanner;

class If2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		if(age > 5) 
		{
			System.out.println("Paid the ticket fees.");
		}
		System.out.println("Enter inside the park.");
	}
}
