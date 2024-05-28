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
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(name);
	}
}
