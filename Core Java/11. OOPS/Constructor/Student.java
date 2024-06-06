// Method Chaining

class Student 
{
	String name;
	int rollNo;
	char div;
	long phno;
	int age;

	Student()
	{
		System.out.println("From No-Argument Constructor");
	}

	Student(String name, int id, char div, long phno, int age)
	{
		this.name = name;
		rollNo = id;
		this.div = div;
		this.phno = phno;
		this.age = age;
	}

	public Student showName()
	{
		System.out.println("Name: "+name);

		return this;
	}

	public Student showId()
	{
		System.out.println("Roll No: "+rollNo);

		return this;
	}

	public Student showDivision()
	{
		System.out.println("Division: "+div);

		return this;
	}

	public Student showPhone()
	{
		System.out.println("Phone No: "+phno);

		return this;
	}

	public Student showAge()
	{
		System.out.println("Age: "+age);

		return this;
	}
}
