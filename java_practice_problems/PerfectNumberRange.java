package java_practice_problems;

public class PerfectNumberRange 
{

	public static void main(String[] args) 
	{
		int num=100;
		for(int i=1; i<=num; i++)
		{
			int temp=i, rem=0, rev=0;
			while(temp>0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			if(i==rev)
				System.out.println(i);
		}
	}

}

