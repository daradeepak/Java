package javaprograms;

public class Tribonacci {

	public static void main(String[] args) 
	{
		int first=0, second=1, third=1, num=10, sum=0;
		System.out.print(first+" "+second+" "+third);
		
		for(int i=3; i<=num; i++)
		{
			sum=first+second+third;
			first = second;
			second = third;
			third = sum;
			
			System.out.print(" "+sum);
		}
	}

}
