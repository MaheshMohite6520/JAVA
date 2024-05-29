class NumberProcessor 
{
	private int number;

	NumberProcessor(int initialNumber)
	{
		this.number = initialNumber;
	}

	NumberProcessor square()
	{
		number = number * number;
		return this;
	}

	NumberProcessor increament()
	{
		number++;
		return this;
	}

	int getResult()
	{
		return number;
	}
}
