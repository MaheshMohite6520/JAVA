// Constructor Chaining

class Employee 
{
	String name;
	int empId;
	double salary;
	String dept;

	String blood;
	double height;
	int wt;

	Employee()
	{
		System.out.println("From No-Argument Constructor");
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

		this.blood = blood;

		System.out.println("Form Generated!");
	}

	Employee(String name, int empId, double salary, String dept, String blood, double height)
	{
		this(name, empId, salary, dept, blood);

		this.height = height;

		System.out.println("Form generated!");
	}

	Employee(String name, int empId, double salary, String dept, String blood, double height, int wt)
	{
		this(name, empId, salary, dept, blood, height);

		this.wt = wt;

		System.out.println("Form Generated!");
	}

	public void displayEmployee()
	{
		System.out.println(name);
		System.out.println(empId);
		System.out.println(salary);
		System.out.println(dept);
		System.out.println(blood);
		System.out.println(height);
		System.out.println(wt);
	}
}
