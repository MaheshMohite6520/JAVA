import java.util.Scanner;

class IfElseLadder2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a alphabet: ");
		char ch = sc.next().charAt(0);

		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			if (ch >= 'a' && ch <= 'z')
			{
				System.out.println("It is an lowercase alphabet");
			}
			else
			{
				System.out.println("It is an uppercase alphabet");
			}
		}
		else
		{
			System.out.println("It is not an alphabet");
		}
		
	}
}
