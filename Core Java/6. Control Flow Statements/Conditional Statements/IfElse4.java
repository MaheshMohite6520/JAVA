import java.util.Scanner;

class IfElse4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a alphabet: ");
		char ch = sc.next().charAt(0);

		if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
		{
			if(ch >= 'a' && ch <= 'z')
			{
				System.out.println("It is an Lowercase Alphabet");
			}
			else
			{
				System.out.println("It is an Uppercase Alphabet");
			}
		}
		else
		{
			System.out.println("It is not an Alphabet");
		}
		
	}
}
