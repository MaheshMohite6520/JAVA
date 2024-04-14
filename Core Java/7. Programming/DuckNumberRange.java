class DuckNumberRange 
{
	public static void main(String[] args) 
	{
		int start = 1;
		int end = 100;

		for (int i = start; i <= end; i++)
		{
			int temp = i;

			while(temp > 0)
			{
				int rem = temp % 10;

				if(rem == 0)
				{
					System.out.println(i);
					break;
				}

				temp /= 10;	
			}	
		}
	}
}
