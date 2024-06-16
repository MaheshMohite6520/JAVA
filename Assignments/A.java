class A 
{
	static byte q = 20;
	static short b = 22;

	static String c = "String";

	public static void main(String[] args) 
	{
		A a = new A();
		A b = new A();
		A c = new A();

		System.out.print(a.c);
		System.out.print(b.b);
		System.out.print(c.a);
	}
}
