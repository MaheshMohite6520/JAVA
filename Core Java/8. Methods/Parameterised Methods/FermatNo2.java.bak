class FermatNo2 
{
	public static void main(String[] args) 
	{
		printFermatNumbers(10);
	}

    public static double power(double base, double raise) 
	{
		double pow = 1;

		for (double i = raise; i > 0; i--) 
		{
			pow *= base;
		}

        return pow;
    }

    public static void printFermatNumbers(double num) 
	{
        for (double i = 0; i <= num; i++) 
		{
            double fermatNumber = fermat(i);
            System.out.println(fermatNumber);
        }
    }

    public static double fermat(double num) 
	{
        double ans = 0;
        double i = 0;

        while (i <= num) 
		{
            ans += 2 * power(2, power(2, i)) + 1;
            i++;
        }

        return ans;
    }
}
