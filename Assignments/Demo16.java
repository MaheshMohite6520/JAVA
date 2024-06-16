class Demo16 
{
	int num = 52;

	public static void main(String[] args) 
	{
		Demo16 d1 = new Demo16();
		Demo16 d2 = new Demo16();

		d2 = d1;

		d1.num = 85;

		System.out.println(d2.num);
	}
}
