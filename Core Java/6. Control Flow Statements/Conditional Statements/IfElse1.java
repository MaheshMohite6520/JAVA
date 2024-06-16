import java.util.Scanner;

class IfElse1 
{
	public static void main(String[] args) 
	{
		Scanner xc = new Scanner(System.in);
		System.out.print("Enter your pin: ");

		int pin = xc.nextInt();

		if(pin == 1234)
		{
			System.out.println("Login Succesful!");
		}
		else
		{
			System.out.println("Incorrect Password, Login Unsuccesful!");
		}
	}
}
