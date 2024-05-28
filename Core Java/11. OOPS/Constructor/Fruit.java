// Method Chaining

class Fruit 
{
	String name;
	double price;
	String color;
	String taste;

	Fruit()
	{
		System.out.println("From No-Argument constructor");
	}

	Fruit(String name, double price, String color, String taste)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.taste = taste;
	}

	public Fruit showName()
	{
		System.out.println(name);

		return this;
	}

	public Fruit showPrice()
	{
		System.out.println(price);

		return this;
	}

	public Fruit showColor()
	{
		System.out.println(color);

		return this;
	}

	public Fruit showTaste()
	{
		System.out.println(taste);

		return this;
	}
}
