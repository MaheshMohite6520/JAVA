import java.util.Scanner;

class DynamicBoolean
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter true or false: ");
		boolean b1 = sc.nextBoolean();

		System.out.print("Enter true or false: ");
		boolean b2 = sc.nextBoolean();

		System.out.println("b1: " + b1);
		System.out.println("b2: " + b2);
	}
}
