// All the methods are present here.

class Utility 
{
	public static void main(String[] args) 
	{
		System.out.println(count(1234));
		System.out.println(power(10, 3));
		System.out.println(sumOfDigits(1234));
		System.out.println(isPrime(31));
		System.out.println(addition(10,20));
		System.out.println(subtraction(40,20));
		System.out.println(multiplication(10,20));
		System.out.println(division(40,20));
		System.out.println(modulus(50,20));
		convertToChar(75);
		convertToUpperToLower('m');
		System.out.println(reverse(4567));
		System.out.println(isPalindrome(1221));
		System.out.println(isEvenOdd(45));
		System.out.println(digitSum(45));
		System.out.println(digitProduct(45));
		System.out.println(sumOfSquareOfDigits(34));
		System.out.println(productOfSquareOfDigits(34));
		System.out.println(sumOfPrimeDigits(234567));
		System.out.println(productOfPrimeDigits(234567));
		System.out.println(sumOfSquareOfPrimeDigits(234567));
		System.out.println(rotate(1234));
		System.out.println(isUnique(34567));
		System.out.println(sumOfFactor(12));
		System.out.println(productOfFactor(12));
		System.out.println(isBouncy(12342));
		System.out.println(returnPrime(6));
		System.out.println(isEvil(15));
		System.out.println(isFascinating(192));
		System.out.println(isTwistedPrime(13));
		System.out.println(isAutomorphic(80));
		System.out.println(isGood(12));
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

	public static int power(int base, int raise)
	{
		int pow = 1;

		for (int i = raise; i > 0; i--)
		{
			pow *= base;
		}

		return pow;
	}

	public static int sumOfDigits(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			sum += last;
			num /= 10;
		}

		return sum;
	}

	public static boolean isPrime(int num)
	{
		int den = 2;

		while (den < num)
		{
			if (num % den == 0)
			{
				break;
			}

			den++;
		}

		return num == den;
	}

	public static int addition(int a, int b)
	{
		return a + b;
	}

	public static int subtraction(int a, int b)
	{
		return a - b;
	}

	public static int multiplication(int a, int b)
	{
		return a * b;
	}

	public static int division(int a, int b)
	{
		return a / b;
	}

	public static int modulus(int a, int b)
	{
		return a % b;
	}

	public static void convertToChar(int num)
	{
		if (num >= 0 && num <= 127)
		{
			System.out.println((char)num);
		}
		else
		{
			System.out.println("Cannot convert to char!");
		}
	}

	public static void convertToUpperToLower(char ch)
	{
		if (ch >= 65 && ch <= 90)
		{
			System.out.println((char)(ch + 32));
		}
		else if (ch >= 97 && ch <= 122)
		{
			System.out.println((char)(ch - 32));
		}
	}

	public static int reverse(int num)
	{
		int rev = 0;

		while (num != 0)
		{
			int last = num % 10;
			rev = rev * 10 + last;
			num /= 10;
		}

		return rev;
	}

	public static boolean isPalindrome(int num)
	{
		return num == reverse(num);
	}

	public static boolean isEvenOdd(int num)
	{
		if (num % 2 == 0)
		{
			return true;
		}

		return false;
	}

	public static int digitSum(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}

	public static int digitProduct(int num)
	{
		int product = 1;

		while (num != 0)
		{
			product *= num % 10;
			num /= 10;
		}

		return product;
	}

	public static int sumOfSquareOfDigits(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;
			int square = last * last;
			sum += square;
			num /= 10;
		}

		return sum;
	}

	public static int productOfSquareOfDigits(int num)
	{
		int product = 1;

		while (num != 0)
		{
			int last = num % 10;
			int square = last * last;
			product *= square;
			num /= 10;
		}

		return product;
	}

	public static int sumOfPrimeDigits(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;

			if (isPrime(last))
			{
				sum += last;
			}

			num /= 10;
		}

		return sum;
	}

	public static int productOfPrimeDigits(int num)
	{
		int product = 1;

		while (num != 0)
		{
			int last = num % 10;

			if (isPrime(last))
			{
				product *= last;
			}

			num /= 10;
		}

		return product;
	}

	public static int sumOfSquareOfPrimeDigits(int num)
	{
		int sum = 0;

		while (num != 0)
		{
			int last = num % 10;

			if (isPrime(last))
			{
				sum += last * last;
			}

			num /= 10;
		}

		return sum;
	}

	public static int rotate(int num)
	{
		return (num % 10) * power(10, count(num)-1) + (num /= 10);
	}

	public static boolean isUnique(int num)
	{
		while (num != 0)
		{
			int last = num % 10;
			num /= 10;

			int temp = num;

			while (temp != 0)
			{
				if (last == temp % 10)
				{
					return false;
				}

				temp /= 10;
			}

			num /= 10;
		}

		return true;
	}

	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum = 0;

		int temp = num;
		while (temp != 0)
		{
			int last = temp % 10;
			sum += power(last, ct);
			temp /= 10;
		}

		return sum == num;
	}

	public static boolean isDisarium(int num)
	{
		int ct = count(num);
		int sum = 0;

		int temp = num;
		while (temp != 0)
		{
			int last = temp % 10;
			sum += power(last, ct);
			ct--;
			temp /= 10;
		}

		return sum == num;
	}

	public static int sumOfFactor(int num)
	{
		int sum = 0;

		for (int i = 1; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}

		return sum;
	}

	public static int productOfFactor(int num)
	{
		int product = 1;

		for (int i = 1; i <= num/2; i++)
		{
			if (num % i == 0)
			{
				product *= i;
			}
		}

		return product;
	}

	public static boolean isBouncy(int num)
	{
		boolean increment = false;
		boolean decrement = false;
			
		int last = num % 10;
		
		while (num > 9)
		{
			num /= 10;
			int secLast = num % 10;

			if (last > secLast)
			{
				increment = true;
			}
			else if (last < secLast)
			{
				decrement = true;
			}
			
			if (increment == true && decrement == true)
			{
				return true;
			}
			else
			{
				last = secLast;
			}
		}

		return false;
	}

	public static int returnPrime(int num)
	{
		for (int i = num; ; i++)
		{
			int den = 2;
			while (den < i)
			{
				if (i % den == 0)
				{
					break;
				}

				den++;
			}

			if (i == den)
			{
				return den;
			}
		}
	}

	public static boolean isEvil(int num)
	{
		int ct = 0;

		while (num != 0)
		{
			int last = num % 2;

			if (last == 1)
			{
				ct++;
			}
		
			num /= 2;
		}

		if (ct >= 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isFascinating(int num)
	{
		int num2 = num * 2;
		int num3 = num * 3;

		int ans1 = num * power(10, count(num2)) + num2;
		int ans2 = ans1 * power(10, count(num3)) + num3;

		if (isUnique(ans2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean isTwistedPrime(int num)
	{
		int rev = reverse(num);

		if (isPrime(num))
		{
			if (isPrime(rev))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}	
	}

	public static boolean isAutomorphic(int num)
	{
		int nextNum = num + 1;

		for (int i = 1; i < num; i++)
		{
			if (nextNum == i * i)
			{
				return true;
			}
			else if (nextNum < i * i)
			{
				return false;
			}
		}

		return false;
	}

	public static boolean isGood(int num)
	{
		int sum = sumOfDigits(num);

		if (num % sum == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
