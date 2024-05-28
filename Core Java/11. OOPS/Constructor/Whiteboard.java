class Whiteboard 
{
	String brand;
	String color;
	double price;

	// No Argument Constructor
	Whiteboard()
	{
		System.out.println("From No Arguments Constructor.");
	}

	// Parameterised Constructor
	Whiteboard(String brand, String color, double price)
	{
		System.out.println("From Parameterised Constructor.");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public void displayWhiteboard()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}
