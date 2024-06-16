import java.util.Scanner;

class PinVerification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int savedPin = 1234;
		int n = 5;
		int attempt = 0;

		do
		{
			System.out.print("Enter your Pin: ");
			int pin = sc.nextInt();

			if(savedPin == pin)
			{
				System.out.println("Login Succes!");
				break;
			}
			attempt++;

			if(attempt < 3)
			{
				System.out.println("Incorrect Pin! Please try again!");
				System.out.println("Remaining Attempts are " + (3 - attempt));
			}
		}
		while (attempt < 3);

		if(attempt == 3)
		{
			System.out.println("Maximun limit reached!");
		}
	}
}
