class Sack 
{
	String brand;
	String color;
	double price;
	String name;

	// No Argument Constructor
	Sack()
	{
		System.out.println("From No Arguments Constructor.");
	}

	// Parameterised Constructor
	Sack(String brand, String color, double price, String name)
	{
		System.out.println("From Parameterised Constructor.");
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.name = name;
	}

	public void displaySack()
	{
		System.out.println("Sack Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("Model: "+name);

		System.out.println("Sack Created!");
	}
}
