import java.util.Scanner;

class DynamicChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first character: ");
		char ch1 = sc.next().charAt(0);

		System.out.print("Enter second character: ");
		char ch2 = sc.next().charAt(0);

		System.out.println("You have entered: ");

		System.out.println("first character: " + ch1);
		System.out.println("first character: " + ch2);
	}
}
