class Snippet1 
{
	public static void main(String[] args) 
	{
		int a = 5, b = 10, c = 26, d ;

		d = a + ++b + --c ;

		a = d++ * 10 - ++b ;

		b = a - b++ ;

		c = -b + ++c;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
}
