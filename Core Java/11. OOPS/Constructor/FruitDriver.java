// Method Chaining

class FruitDriver 
{
	public static void main(String[] args) 
	{
		Fruit f1 = new Fruit("Apple", 500.0, "Red", "Sweet");

		// f1.showName().showPrice().showColor().showTaste();

		// f1.showTaste().ShowName();	// CTE

		f1.showColor().showName().showPrice().showTaste();
	}
}
