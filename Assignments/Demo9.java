class Demo9 
{
	public static void main(String[] args) 
	{
		byte a  = 10;
		{
			a = 100;
			System.out.println(a);
		}
		int x = 250;
		System.out.println(a);
	}
	System.out.println(x);
}
