class Subtraction 
{
	public static void main(String[] args) 
	{
		byte a = 15;
		byte b = 10;
		int result1 = a - b;
		System.out.println("byte - byte = (int) " + result1);

		short c = 50;
		short d = 10;
		int result2 = c - d;
		System.out.println("short - short = (int) " + result2);

		int e = 55;
		int f = 30;
		int result3 = e - f;
		System.out.println("int - int = (int) " + result3);

		char g = 'Z';
		char h = 'A';
		int result4 = g - h;
		System.out.println("char - char = (int) " + result4);

		long i = 500l;
		long j = 100l;
		long result5 = i - j;
		System.out.println("long - long = (long) " + result5);

		float k = 2.5f;
		float l = 1.0f;
		float result6 = k - l;
		System.out.println("float - float = (float) " +  result6);

		double m = 23.5;
		double n = 10.8;
		double result7 = m - n;
		System.out.println("double - double = (double) " + result7);


		// we can't perform subtraction on string and boolean

		// String o = "Operators: ";		// Compile Time Error
		// String p = "Addition";
		// String result8 = o - p;
		// System.out.println(result8);

		// boolean q = true;				// Compile Time Error
		// boolean r = true;
		// boolean result9 = q + r;
		// System.out.println(result9);
	}
}
