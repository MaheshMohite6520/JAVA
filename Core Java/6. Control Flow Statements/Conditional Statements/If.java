import java.util.Scanner;

class If 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("You are paid student or not (Only enter true or false): ");
		boolean b = sc.nextBoolean();

		if(b) 
		{
			System.out.println("Pay the fees: 36000 Rs.");
		}
		System.out.println("You can sit in the class");
	}
}
