// Method Overloading

class Calculator 
{
	public static void main(String[] args) 
	{
		// Addition
		System.out.println();
		System.out.println("Addition: ");

		System.out.println(add(10, 12));
		System.out.println(add('a', 12));
		System.out.println(add(22.0, 11.0));

		// Subtraction
		System.out.println();
		System.out.println("Subtraction: ");

		System.out.println(subtract(100, 20));
		System.out.println(subtract(22.8, 10.2));

		// Multiplication
		System.out.println();
		System.out.println("Multiplication: ");

		System.out.println(mul(10, 20));
		System.out.println(mul(2.8, 1.2));

		// Division
		System.out.println();
		System.out.println("Division: ");

		System.out.println(div(100, 20));
		System.out.println(div(8.8, 1.1));

		// Modulus
		System.out.println();
		System.out.println("Modulus: ");

		System.out.println(div(100, 20));
		System.out.println(div(80.8, 1.12));
	}

	// Addition of 2 integers
	public static int add(int a, int b)
	{
		return a + b;
	}

	// Addition of 2 doubles
	public static double add(double a, double b)
	{
		return a + b;
	}

	// Subtraction of 2 integers
	public static int subtract(int a, int b)
	{
		return a - b;
	}

	// Subtraction of 2 doubles
	public static double subtract(double a, double b)
	{
		return a - b;
	}

	// Multiplication of 2 integers
	public static int mul(int a, int b)
	{
		return a * b;
	}

	// Multiplication of 2 doubles
	public static double mul(double a, double b)
	{
		return a * b;
	}

	// Division of 2 integers
	public static int div(int a, int b)
	{
		return a / b;
	}

	// Division of 2 doubles
	public static double div(double a, double b)
	{
		return a / b;
	}

	// Modulus of 2 integers
	public static int mod(int a, int b)
	{
		return a % b;
	}

	// Modulus of 2 doubles
	public static double mod(double a, double b)
	{
		return a % b;
	}
}