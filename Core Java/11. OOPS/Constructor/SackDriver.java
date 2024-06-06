class SackDriver 
{
	public static void main(String[] args) 
	{
		Sack l1 = new Sack();
		l1.displaySack();

		System.out.println("---------------------------------------------");

		Sack l2 = new Sack("American Touristee", "Black", 3000.0, "Backpacks");
		l2.displaySack();
	}
}
