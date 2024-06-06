class WhiteboardDriver 
{
	public static void main(String[] args) 
	{
		Whiteboard l1 = new Whiteboard();
		l1.displayWhiteboard();

		System.out.println("-----------------------------");

		Whiteboard l2 = new Whiteboard("Pragati Systems", "White", 5000.0);
		l2.displayWhiteboard();
	}
}
