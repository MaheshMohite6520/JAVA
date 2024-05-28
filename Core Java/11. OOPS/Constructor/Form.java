// Constructor Overloading

class Form 
{
	// Mandatory feilds
	String name;
	String location;
	String email;
	long phno;

	// Optional feilds
	String blood;
	double height;
	int wt;

	// No Argument Constructor 
	Form()
	{
		System.out.println("From No-Argument Constructor");
	}

	// This constructor accepts only mandatory feilds
	Form(String name, String loc, String email, long phno)
	{
		System.out.println("From Only Mandatory-Feilds Constructor");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;
	}

	// This constructor accepts all feilds
	Form(String name, String loc, String email, long phno, String blood, double height, int wt)
	{
		System.out.println("From All-Feilds Constructor");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.blood = blood;
		this.height = height;
		this.wt = wt;
	}

	// This constructor accepts all mandatory feilds and blood group
	Form(String name, String loc, String email, long phno, String blood)
	{
		System.out.println("From Mandatory-Feilds Constructor and Blood-group");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.blood = blood;
	}

	// This constructor accepts all mandatory feilds and height
	Form(String name, String loc, String email, long phno, double height)
	{
		System.out.println("From Mandatory-Feilds Constructor and Height");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.height = height;
	}

	// This constructor accepts all mandatory feilds and Weight
	Form(String name, String loc, String email, long phno, int wt)
	{
		System.out.println("From Mandatory-Feilds Constructor and Weight");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.wt = wt;
	}

	// This constructor accepts all mandatory feilds, Blood and Height
	Form(String name, String loc, String email, long phno, String blood, double height)
	{
		System.out.println("From Mandatory-Feilds Constructor, Blood and Height");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.blood = blood;
		this.height = height;
	}

	// This constructor accepts all mandatory feilds, Blood and Weight
	Form(String name, String loc, String email, long phno, String blood, int wt)
	{
		System.out.println("From Mandatory-Feilds Constructor, Blood and Weight");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.blood = blood;
		this.wt = wt;
	}

	// This constructor accepts all mandatory feilds, height and Weight
	Form(String name, String loc, String email, long phno, double height, int wt)
	{
		System.out.println("From Mandatory-Feilds Constructor, Height and Weight");

		this.name = name;
		location = loc;
		this.email = email;
		this.phno  = phno;

		this.height = height;
		this.wt = wt;
	}

	public void displayForm()
	{
		System.out.println(name);
		System.out.println(location);
		System.out.println(email);
		System.out.println(phno);

		System.out.println(blood);
		System.out.println(height);
		System.out.println(wt);
	}
}
