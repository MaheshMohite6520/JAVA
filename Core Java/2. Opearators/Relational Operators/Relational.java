class Relational 
{
	public static void main(String[] args) 
	{
		System.out.println(3 < 4);							// true					
		System.out.println('a' > 'A');						// true
		System.out.println(0.0 > 0);						// false
		System.out.println('q' <= 113);						// true
		System.out.println(59.99999 == 60);					// false
		System.out.println(true == false);					// false
		System.out.println(true != false);					// true
		System.out.println(true != true);					// false
		System.out.println("Hi" != "Bye");					// true
		System.out.println("Hi" == "hi");					// false
		System.out.println();
		System.out.println(1.1f < 1.1);						// false 
		System.out.println((22.0/7.0) > (22.0f/7.0f));		// true
		System.out.println(22.0/7.0);						// 3.142857142857143
		System.out.println(22.0f/7.0f);						// 3.142857

		// System.out.println(true > false);				// bad operand types for binary operator '>'	
		// System.out.println(byte < short);				// Compile Time Error
		// System.out.println(true == 1);					// incomparable types: boolean and int
		// System.out.println("Hello" < "Hi");				// bad operand types for binary operator '<'
		// System.out.println("Hi" > byte);					// Compile Time Error
		// System.out.println(0.0 < 0.0l);					// illegal start of expression

		System.out.println('z' > 200);						// false
		System.out.println((22.0/7.0) < (22.0f/7.0f));		// false
		System.out.println("Hi" == "Hi");					// true
							
	}
}
