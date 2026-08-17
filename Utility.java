/* Create a class named 'Utility' with the following static methods:
1. public static long factorial (long value)
	* Returns the factorial of the given numbers as a long.
2. public static boolean isPrime (int value)
	* Returns true if the given number is prime; otherwise , returns false.
3. public static boolean isEven(long value)
	* Returns true if the given number is even; otherwise , returns false.
4. public static boolean isOdd(long value)
	* Returns true if the given number is odd; otherwise, returns false.
*/

public class Utility
{
	public static long factorial(long value)
	{
		long fact = 1;
		long i = 1;
		do
		{
			fact = fact * value;
			value --;
		}while(value > 0);
		/*for(long i = 1; i <= value; i ++)
		{
			fact = fact * i;
		}*/
		return fact;
	}
	
	public static boolean isPrime(int value)
	{
		if(value <= 1)
		{
			return false;
		}
		for(int i = 2; i < value; i ++)
		{
			if(value % i == 0)
				return false;
		}
		return true;		
	}
	
	public static boolean isEven(long value)
	{
		if(value % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(long value)
	{
		if(value % 2 != 0)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println("Factorial of 5 = " + Utility.factorial(5));
		System.out.println("Is 13 Prime ?  = " + Utility.isPrime(13));
		System.out.println("Is 3 Even ?  = " + Utility.isEven(3));
		System.out.println("Is 3 Odd ?  = " + Utility.isOdd(3));
	}
}
