class MarkerDriver 
{
	public static void main(String[] args) 
	{
		Marker m1 = new Marker();
		m1.displayMarker();

		System.out.println("-----------------------------");

		Marker m2 = new Marker("Camlin", "Green", 100.0);
		m2.displayMarker();
	}
}
