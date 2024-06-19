package java_practice_problems;

public class PalPrime 
{

	public static void main(String[] args) 
	{
		int num=11 , rem=0, rev=0, temp=num;
		while(num>0) //123>0 12>0 1>0 0>0
		{
			rem=num%10; //3 2 1
			rev=rev*10+rem; //3*10+2=32*10+1=321
			num/=10; // 12 1  0
		}
		
		System.out.println(rev);
		
		int count=0;
		for(int i=1; i<20; i++) 
		{
			if(temp%i==0) 
				count++;
		}
		
		if(count==2 && rev==temp)
			System.out.println("pal-prime");
		else
			System.out.println("prime");
	}
	

}
