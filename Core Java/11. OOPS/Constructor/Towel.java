class Towel 
{
	String brand;
	String color;
	double price;

	/*
	Towel()
	{
		System.out.println("From No-Argument Constructor");
	}
	*/

	Towel(String brand, String color, double price)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public void displayTowel()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}