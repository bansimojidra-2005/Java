//write a java program that
// -Accept an integer
// -Prints whether it is prime
// -Use for while / or do-while loop
// -Uses if-else
// -Demonstrate break and continue

import java.util.Scanner;
public class PrimeMain
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: \n");
		int num = sc.nextInt();
		 if (num < 0) 
		 {
           System.out.println(num +" is Negative ");
		 }
		 else
		 {
			if(Prime.isPrime(num))
			{
				System.out.println(num + "is Prime number");
			}
			else
			{
				System.out.println(num + "is not a Prime number");
			}
		}
		sc.close();
	}
}