class BooksDriver 
{
	public static void main(String[] args) 
	{
		Books l1 = new Books();
		l1.displayBooks();

		System.out.println("-----------------------------");

		Books l2 = new Books("Red", 500.0, 150);
		l2.displayBooks();
	}
}
