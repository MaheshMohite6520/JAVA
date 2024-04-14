// 80 + 1 = 81, 80 is sunny no cause 81 is perfect square.

class SunnyNo 
{
	public static void main(String[] args) 
	{
		System.out.println(isSunny(80));
	}

	public static boolean isSunny(int num)
	{
		int nextNum = num + 1;

		int i;
		for (i = 1; ; i++)
		{
			if (nextNum == i * i)
			{
				break;
			}
			else if (i * i > nextNum)
			{
				break;
			}
			else
			{
				i++;
			}
		}

		if (nextNum == i * i)
		{
			return true;
		}

		return false;
	}
}
