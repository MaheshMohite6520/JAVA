class NumberProcessingDemo 
{
	public static void main(String[] args) 
	{
		NumberProcessor processor = new NumberProcessor(3);
		int result = processor.square().increament().getResult();

		System.out.println(result);
	}
}
