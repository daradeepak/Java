package java_practice_problems;

public class TwistedPrime 
{

	public static void main(String[] args) 
	{
		
		//Prime
		int num=14, count=0, temp=num; 
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0) 
				count++;
		}
		if(count==2)
			System.out.println("prime");
		
		//Reverse
		int rev=0, rem=0;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		System.out.println(rev);
		
		//check reverse is prime
		int count2=0; 
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0) 
				count2++;
		}
		
		if(count==2 && count2==2)
			System.out.println("Twisted prime");
		else
			System.out.println("Not a twisted prime");
	}
	

}
