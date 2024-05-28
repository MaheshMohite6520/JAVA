class Chair 
{
	String color;
	double price;
	double weight;

	// No Argument Constructor
	Chair()
	{
		System.out.println("From No Arguments Constructor.");
	}

	// Parameterised Constructor
	Chair(String color, double price, double weight)
	{
		System.out.println("From Parameterised Constructor.");
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	public void displayChair()
	{
		System.out.println(color);
		System.out.println(price);
		System.out.println(weight);
	}
}
