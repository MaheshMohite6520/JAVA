class Car 
{
	String name = "Aston-Martin";
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
	Car()
	{
		System.out.println(name);
		System.out.println("From Car Constructor");
		System.out.println();
	}

	// Parameterised Constructor
	Car(String name, String color, double price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public void displayCar()
	{
		System.out.println("Car Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);

		System.out.println("Car Created!");
	}
}
