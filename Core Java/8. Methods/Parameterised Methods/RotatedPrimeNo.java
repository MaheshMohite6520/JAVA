import java.util.Scanner;

class RotatedPrimeNo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		System.out.println(isRotatedPrime(num));
	}

	public static boolean isRotatedPrime(int num)
	{
		int temp = num;
		if (isPrime(temp))
		{
			temp = rotate(temp);

			while (temp != num)
			{
				if (isPrime(temp))
				{
					temp = rotate(temp);
				}
				else
				{
					break;
				}
			}
		}
		else
		{
			return false;
		}

		return temp == num;
	}

	public static int count(int num)
	{
		int ct = 0;

		while (num != 0)
		{
			ct++;
			num /= 10;
		}

		return ct;
	}

	public static int power(int base, int count)
	{
		int pow = 1;

		for (int i = count; i > 0; i--)
		{
			pow *= base;
		}

		return pow;
	}

	public static boolean isPrime(int num)
	{
		int i;
		for (i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				break;
			}
		}

		return num == i;
	}

	/*
	public static int rotate(int num)
	{
		int ans = 0;

		int last = num % 10;
		num /= 10;

		int ct = count(num);
		
		ans = last * power(10, ct) + num;

		return ans;
	}
	*/

	public static int rotate(int num)
	{
		return (num % 10) * power(10, count(num)-1) + (num / 10);
	}
}
