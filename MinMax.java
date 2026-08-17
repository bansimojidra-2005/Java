//WAP that reads five integer numbers from the commandline, 
//sorts them, and then display the minimum and maximum values

public class MinMax
{
	public static void main(String args[])
	{
		int num[] = new int[5];
		int i, j, temp;
		
		//check the 5 numbers
		if(args.length != 5)
		{
			System.out.println("Enter exactly 5 integer number....");
			return;
		}
		
		//stors numbers
		for(i=0;i<5;i++)
		{
			num[i] = Integer.parseInt(args[i]);
		}
		
		//sort numbers
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		//display sorted number
		System.out.println("Sorted numbers :");
		for(i=0;i<5;i++)
		{
			System.out.println(num[i] + " ");
		}
		
		//display Minimu and Maximum number
		System.out.println();
		System.out.println("Minimum Number : " + num[0]);
		System.out.println("Maximum Number : " + num[4]);
	}
}