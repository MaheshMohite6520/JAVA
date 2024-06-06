class Mobile 
{
	String brand;
	String color;
	double price;
	String name;

	// No Argument Constructor
	Mobile()
	{
		System.out.println("From No Arguments Constructor.");
		System.out.println();
	}

	// Parameterised Constructor
	Mobile(String brand, String rang, double price, String name)
	{
		this.brand = brand;
		color = rang;
		this.price = price;
		this.name = name;
	}

	public void displayMobile()
	{
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Model: "+name);

		System.out.println("Mobile Created!");
	}
}
