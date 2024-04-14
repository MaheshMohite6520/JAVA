class Snippet2 
{
	public static void main(String[] args) 
	{
		int p = -2, q = 8, r = p+q, s;

		s = r++ + p++;

		q++;

		s = q--;

		r = p + q++ + -s--;

		q = q--;

		System.out.println("p: " +p);
		System.out.println("q: " +q);
		System.out.println("r: " +r);
		System.out.println("s: " +s);
	}
}
