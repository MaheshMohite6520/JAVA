class StaticInit1 
{
	static String str = "India";

	public static void main(String[] args) 
	{
		System.out.println(str);

		str = "Bharat";
		System.out.println(str);

		String str = "Pakistan";
		System.out.println(str);

		System.out.println(StaticInit1.str);
	}
}
