class Pant 
{
	String name = "Nike";
	String color;
	double price;

	// Non-Static Block
	{
		System.out.println("From Non-Static block 1");
	}

	{
		System.out.println("From Non-Static block 2");
	}

	{
		System.out.println("From Non-Static block 3");
	}

	// No-Argument Constructor
	Pant()
	{
		System.out.println(name);
		System.out.println("From Pant Constructor");
	}

	// Parameterised Constructor
	Pant(String name, String color, double price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public void displayPant()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println();
	}
}
