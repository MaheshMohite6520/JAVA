import java.util.Scanner;

class Switch6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n**************Welcome to the Hotel***************");

		System.out.println("\nChoose below option\n");

		System.out.println("1. Vegetarian");
		System.out.println("2. Non-Vegetrian");

		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1 :
			{
				System.out.println("\nChoose Menu from below\n");
				
				System.out.println("1. Poha");
				System.out.println("2. Misal");
				System.out.println("3. Vada-Pav");
				System.out.println("4. Veg Thali");

				System.out.print("\nEnter your choice: ");

				switch(sc.nextInt())
				{
					case 1 :
					{
						System.out.println("Your order is arrived. Enjoy your Poha");
						break;
					}
					case 2 :
					{
						System.out.println("Your order is arrived. Enjoy your Misal");
						break;
					}
					case 3 :
					{
						System.out.println("Your order is arrived. Enjoy your Vada-Pav");
						break;
					}
					case 4 :
					{
						System.out.println("Your order is arrived. Enjoy your Veg-Thali");
						break;
					}
				}
				break;
			}

			case 2 :
			{
				System.out.println();
				System.out.println("Choose Menu from below\n");

				System.out.println("1. Chicken Biryani");
				System.out.println("2. Chicken Burger");
				System.out.println("3. Mutton Thali");
				System.out.println("4. Chicken Thali");

				System.out.print("\nEnter your choice: ");

				switch(sc.nextInt())
				{
					case 1 :
					{
						System.out.println("\nChoose from below\n");

						System.out.println("1. Half Chicken Biryani - 80 Rs");
						System.out.println("2. Full Chicken Biryani - 120 Rs");

						System.out.print("\nEnter your choice: ");

						switch(sc.nextInt())
						{
							case 1:
							{
								System.out.println("Your order is arrived. Enjoy your Half Chicken Biryani");
								break;
							}
							case 2:
							{
								System.out.println("Your order is arrived. Enjoy your Full Chicken Biryani");
								break;
							}
						}
						break;
					}
					case 2 :
					{
						System.out.println("\nHow many burger do you want: \n");

						System.out.println("1 BUrger  - 50 Rs");
						System.out.println("2 Burgers - 100 Rs");

						System.out.print("\nEnter your choice: ");

						switch(sc.nextInt())
						{
							case 1:
							{
								System.out.println("Your order is arrived. Enjoy your Burger.");
								break;
							}
							case 2:
							{
								System.out.println("Your order is arrived. Enjoy your Burgers.");
								break;
							}
						}
						break;
					}
					case 3 :
					{
						System.out.println("Choose option from below: ");

						System.out.println("1. Specail Mutton Thali - 200 Rs");
						System.out.println("2. Mutton Thali - 150 Rs");

						System.out.print("Enter your choice: ");

						switch (sc.nextInt())
						{
							case 1 :
								{
									System.out.println("Your order is arived. Enjoy your Specail Mutton Thali.");
									break;
								}
							case 2 :
							{
								System.out.println("Your order is arived. Enjoy your Mutton Thali.");
								break;
							}
						
						}
						break;
					}
					case 4 :
					{
						System.out.println("Your order is arrived. Enjoy your Chicken Thali");
						break;
					}
				}
				break;
			}

			default :
			{
				System.out.println("Enter valid choice");
			}
		}
	}
}
