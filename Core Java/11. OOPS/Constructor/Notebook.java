class Notebook 
{
	String brand;
	String color;
	double price;

	// No Argument Constructor
	Notebook()
	{
		System.out.println("From No Arguments Constructor.");
	}

	// Parameterised Constructor
	Notebook(String brand, String color, double price)
	{
		System.out.println("From Parameterised Constructor.");
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public void displayNotebook()
	{
		System.out.println("Notebook Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);

		System.out.println("Notebook Created!");
	}
}
