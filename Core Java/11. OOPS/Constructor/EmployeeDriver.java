// Constructor Chaining

class EmployeeDriver
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Smith", 1001, 50000.0, "CS", "O+", 5.9, 60);

		e1.displayEmployee();

		System.out.println("------------------------------------------------");

		Employee e2 = new Employee("Virat", 1002, 100000.0, "ME");

		e2.displayEmployee();

		System.out.println("----------------------------------------------");

		Employee e3 = new Employee("Rohit", 1003, 80000.0, "CV", "O-");

		e3.displayEmployee();

		System.out.println("----------------------------------------------");

		Employee e4 = new Employee("Rishabh", 1004, 30000.0, "EC", "AB+", 5.8);

		e4.displayEmployee();

		System.out.println("----------------------------------------------");
	}
}
