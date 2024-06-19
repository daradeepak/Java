package javaprograms;

public class PrimeRange {

	public static void main(String[] args)
	{
		int num=10, count=0;
		
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				System.out.println(i);
				count++;
			}
		}
		if(count == 2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
