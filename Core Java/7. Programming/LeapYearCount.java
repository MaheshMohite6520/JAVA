import java.util.Scanner;

class LeapYearCount
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter a starting year: ");
		int start = sc.nextInt();

		System.out.print("Enter a ending year: ");
		int end = sc.nextInt();

		int count = 1;

		if(start > 1582)
		{
			for(int year=start; year<=end; year++)
			{
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					count++;
				}
			}
			System.out.println("Total Leap Years: " + count);
		}
		else
		{
			System.out.println("The year has to be greater than 1582, the first year the Gregorean calendar was employed");
		}
	}
}
