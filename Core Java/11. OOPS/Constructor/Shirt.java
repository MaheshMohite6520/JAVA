class Shirt 
{	
	String color;
	String brand;
	int size;
	double price;

	// No Argument Constructor
	Shirt()
	{
		System.out.println("From No Arguments Constructor.");
	}

	public void displayShirt()
	{
		System.out.println("Shirt Color: "+color);
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+size);
		System.out.println("Price: "+price);

		System.out.pritnln("Shirt Created!");
	}
}
