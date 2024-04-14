class StatVar 
{
	static byte b ;
	static short s ;
	static char ch ;
	static int i ;
	static long l ;
	static float f ;
	static double d ;
	static boolean bl;
	static String str ;

	public static void main(String[] args) 
	{
		System.out.println("Default value of byte: " + b);
		System.out.println("Default value of short: " + s);
		System.out.println("Default value of char: " + ch*1);
		System.out.println("Default value of int: " + i);
		System.out.println("Default value of long: " + l);
		System.out.println("Default value of float: " + f);
		System.out.println("Default value of double: " + d);
		System.out.println("Default value of boolean: " + bl);
		System.out.println("Default value of string: " + str);
	}
}
