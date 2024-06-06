class NotebookDriver 
{
	public static void main(String[] args) 
	{
		Notebook l1 = new Notebook();
		l1.displayNotebook();

		System.out.println("------------------------------");

		Notebook l2 = new Notebook("Goodluck", "White", 100.0);
		l2.displayNotebook();
	}
}
