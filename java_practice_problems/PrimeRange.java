package java_practice_problems;

public class PrimeRange 
{

	public static void main(String[] args) 
	{
		int end=200;
		for(int start=2; start<=end; start++) //1<=200 2<=200
		{
			int count=0;//count=1
			for(int i=1; i<=start; i++) //1<=1 2<=1 1<=2
			{
				if(start%i==0) 
					count++;
			}
			if(count == 2)
				System.out.println(start+ " prime");


		}
		

	}

}
