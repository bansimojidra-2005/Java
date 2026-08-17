//File Prime.java

public class Prime
{
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		boolean isPrime = true;
		
		for(int i=2;i<num/2;i++)
		{
			if(i==1)
			{
				continue;
			}
		if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}