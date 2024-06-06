class PenDriver 
{
	public static void main(String[] args) 
	{
		Pen l1 = new Pen();
		l1.displayPen();

		System.out.println("-------------------------------");

		Pen l2 = new Pen("BIC Group", "Blue", 10.0, "Cello");
		l2.displayPen();
	}
}
