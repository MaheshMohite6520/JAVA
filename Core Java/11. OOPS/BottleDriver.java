// Object Creation - 2

class BottleDriver 
{
	public static void main(String[] args) 
	{
		Bottle b1 = new Bottle();

		b1.brand	= "Cello";
		b1.price	= 100.00;
		b1.capacity	= 1;
		b1.material = "Fiber";
		b1.color	= "Blue";
		b1.shape	= "Cylindrical";
		b1.type		= "Water Bottle";

		b1.displayBottle();
	}
}
