import java.util.Scanner;

class Intro 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);


		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter your name: ");
		String name = sc. nextLine();

		

		// sc.nextLine();	// for avoiding Buffer issue

		System.out.print("Enter your college name: ");                                                  
		String col = sc.nextLine();
		
		System.out.print("Enter your address: ");                                                  
		String col2 = sc.nextLine();

		System.out.println();
		System.out.println("Your age          : " + age);
		System.out.println("Your name         : "  + name);
		System.out.println("Your college name : " + col);
		System.out.println("Your college name : " + col2); 
	}
}
