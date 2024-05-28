class PencilDriver 
{
	public static void main(String[] args) 
	{
		Pencil l1 = new Pencil();
		l1.displayPencil();

		System.out.println();

		Pencil l2 = new Pencil("Hindustan Pencils", "Silver", 10.0, "Nataraj and Apsara");
		l2.displayPencil();
	}
}
