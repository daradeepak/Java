package java_practice_problems;

public class TwinPrimes 
{

	public static void main(String[] args) 
	{
		int a=41, b=43;
		
		//check-1
		int count=0, count2=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0)
				count++;
		}
		
		//check-2
//		int count2=0;
		for(int i=1; i<=b; i++)
		{
			if(a%i==0)
				count2++;
		}

		//co-prime
		if(count == count2 && (a-b==2 || b-a==2))
			System.out.println("Twin prime");
		else
			System.out.println("Not a prime");
			
		
	}
}
