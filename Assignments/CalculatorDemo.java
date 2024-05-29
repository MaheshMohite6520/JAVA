class CalculatorDemo 
{
	public static void main(String[] args) 
	{
		Calculator calculator = new Calculator(2.5);

		double findResult = calculator.add(3.0).multiply(2.0).getResult();

		System.out.println(findResult);
	}
}
