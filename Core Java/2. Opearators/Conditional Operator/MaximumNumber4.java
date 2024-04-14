class MaximumNumber4 
{
	public static void main(String[] args) 
	{
		int number1 = 100;
		int number2 = 2700;
		int number3 = 300;
		int number4 = 400;


		// Method-1

		// int big1 = number1 > number2 ? number1 : number2;
		// int big2 = number3 > number4 ? number3 : number4;

		// int biggest = big1 > big2 ? big1 : big2 ;
		// System.out.println(biggest);


		// Method-2

		int biggest = ((number1 > number2 ? number1 : number2) > (number3 > number4 ? number3 : number4)) ? (number1 > number2 ? number1 : number2) : (number3 > number4 ? number3 : number4);
		System.out.println(biggest);
	}
}
