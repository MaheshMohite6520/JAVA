class Marker 
{
	String name = "Camlin";
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
	Marker()
	{
		System.out.println(name);
		System.out.println("From No-Argument Marker Constructor");
		System.out.println();
	}

	// Parameterised Constructor
	Marker(String name, String color, double price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

	{
		System.out.println("From Non-Static block 4");
	}

	public void displayMarker()
	{
		System.out.println("Marker Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);

		System.out.println("Marker Created!");
	}

	{
		System.out.println("From Non-Static block 5");
		System.out.println();
	}
}
