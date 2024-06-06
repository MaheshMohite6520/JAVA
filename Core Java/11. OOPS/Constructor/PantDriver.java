class PantDriver 
{
	public static void main(String[] args) 
	{
		Pant p1 = new Pant();
		p1.displayPant();

		System.out.println("-------------------------------------");

		Pant p2 = new Pant("ZUDIO", "Black", 800.0);
		p2.displayPant();
	}
}
