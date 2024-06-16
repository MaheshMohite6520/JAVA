class Relationship 
{
	static String status = "Single";

	String status(String status)
	{
		return status;
	}

	public static void main(String[] args) 
	{
		Relationship status = new Relationship();

		System.out.println("Status: " +status.status(" ") + status.status);
	}
}
