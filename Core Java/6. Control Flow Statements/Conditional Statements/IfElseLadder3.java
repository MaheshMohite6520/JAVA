import java.util.Scanner;

class IfElseLadder3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int number = sc.nextInt();

		if(number == 0)
		{
			System.out.println("0 is not Negative neither Positive Number!");
		}
		else if(number > 0)
		{
			System.out.println("It is an Positive Number1");
		}
		else if(number < 0)
		{
			System.out.println("It is an Negative Number!");
		}
		else
		{
			System.out.println("Enter a valid input!");
		}
	}
}
