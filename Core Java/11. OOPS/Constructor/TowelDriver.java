class TowelDriver 
{
	public static void main(String[] args) 
	{
		Towel t1 = new Towel();

		t1.displayTowel();

		/*
		TowelDriver.java:5: error: constructor Towel in class Towel cannot be applied to given types;
                Towel t1 = new Towel();
                           ^
		required: String,String,double
		found: no arguments
		reason: actual and formal argument lists differ in length
		*/
	}
}
