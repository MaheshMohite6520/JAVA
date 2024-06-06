class Books 
{
	String color;
	double price;
	int pages;

	// No Argument Constructor
	Books()
	{
		System.out.println("From No-Argument Constructor!");
	}

	// Parameterised Constructor
	Books(String color, double price, int pages)
	{
		System.out.println("From Parameterised Constructor!");
		this.color = color;
		this.price = price;
		this.pages = pages;
	}

	public void displayBooks()
	{
		System.out.println("Book Color: "+color);
		System.out.println("Price: "+price);
		System.out.println("No of Pages: "+pages);
	}
}
