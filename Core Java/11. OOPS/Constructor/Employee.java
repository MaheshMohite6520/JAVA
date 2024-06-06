// Constructor Chaining

class Employee 
{
	// Mandatory Details
	String name;
	int empId;
	double salary;
	String dept;

	// Optional Details
	String blood;
	double height;
	int wt;

	Employee()
	{
		System.out.println("From No-Argument Constructor!");
	}

	Employee(String name, int empId, double salary, String dept)
	{
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}

	Employee(String name, int empId, double salary, String dept, String blood)
	{
		this(name, empId, salary, dept);

		// this.name = name;
		// this.empId = empId;
		// this.salary = salary;
		// this.dept = dept;

		this.blood = blood;

		System.out.println("Form Generated!");
	}

	Employee(String name, int empId, double salary, String dept, String blood, double height)
	{
		this(name, empId, salary, dept, blood);

		// this.name = name;
		// this.empId = empId;
		// this.salary = salary;
		// this.dept = dept;
		// this.blood = blood;

		this.height = height;

		System.out.println("Form generated!");
	}

	Employee(String name, int empId, double salary, String dept, String blood, double height, int wt)
	{
		this(name, empId, salary, dept, blood, height);

		// this.name = name;
		// this.empId = empId;
		// this.salary = salary;
		// this.dept = dept;
		// this.blood = blood;
		// this.height = height;

		this.wt = wt;

		System.out.println("Form Generated!");
	}

	public void displayEmployee()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("ID: "+empId);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
		System.out.println("Blood Group: "+blood);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+wt);

		System.out.println("Employee Created!");
	}
}
