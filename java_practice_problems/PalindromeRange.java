package java_practice_problems;

public class PalindromeRange 
{

	public static void main(String[] args) 
	{
		for(int i=10; i<=100; i++) 
		{
			int rem=0,rev=0, temp=i;

			while(temp>0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}	

			if(i == rev)
				System.out.println(i+" palindrome");

		}
		
	}

}
