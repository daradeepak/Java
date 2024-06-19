package java_practice_problems;

public class StrongNumber 
{

	public static void main(String[] args) 
	{
		int num=145, rem=0, sum=0;
		
		while(num>0) 
		{
			int fact=1;
			rem=num%10; 
			for(int i=1; i<=rem; i++) 
			{
				fact = fact*i; 

			}
			num/=10; 
			sum = sum+fact;
			System.out.println(sum);
		}
		System.out.println(sum);




	}

}
