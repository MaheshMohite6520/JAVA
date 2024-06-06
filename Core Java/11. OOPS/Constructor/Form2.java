// Constructor Chaining

class Form2 
{
	String name;
	String location;
	String email;
	long phno;

	String blood;
	double height;
	int wt;

	Form2()
	{
		System.out.println("From No-Argument Constructor");
	}

	Form2(String name, String location, String email, long phno)
	{
		this.name = name;
		this.location = location;
		this.email = email;
		this.phno = phno;
	}

	Form2(String name, String location, String email, long phno, String blood)
	{
		this(name, location, email, phno);

		this.blood = blood;

		System.out.println("Form Generated!");
	}

	Form2(String name, String location, String email, long phno, String blood, double height)
	{
		this(name, location, email, phno, blood);

		this.height = height;

		System.out.println("Form Generated!");
	}

	Form2(String name, String location, String email, long phno, String blood, double height, int wt)
	{
		this(name, location, email, phno, blood, height);

		this.wt = wt;

		System.out.println("Form Generated!");
	}

	public void displayForm2()
	{
		System.out.println("Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("Email: "+email);
		System.out.println("Mobile No: "+phno);
		System.out.println("Blood Group: "+blood);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+wt);

		System.out.println("Form Created!");
	}
}
