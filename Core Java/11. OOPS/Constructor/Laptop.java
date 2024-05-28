class Laptop 
{
	String brand;
	String color;
	double price;
	String name;

	// No Argument Constructor
	Laptop()
	{
		System.out.println("From No Arguments Constructor.");
	}

	// Parameterised Constructor
	Laptop(String brand, String color, double price, String name)
	{
		System.out.println("From Parameterised Constructor.");
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.name = name;
	}

	public void displayLaptop()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(name);
	}
}
