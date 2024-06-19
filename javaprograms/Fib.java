package javaprograms;

public class Fib
{
	public static void main(String args[])
	{
//		int n1=0, n2=1, sum=0, count=10;
//		System.out.print("0 1");
//		
//		
//		while(n1<=count)
//		{
//			sum=n1+n2;
//			n1 = n2;
//			n2 = sum;
//			
//			System.out.print(" "+sum);
//			count++;
		
		int first = 0, second=1;
		System.out.print(first +" ");
		System.out.print(second +" ");

		
		for(int i=0; i<=10; i++)
		{
			int sum = first+second;
			first = second;
			second = sum;
			
			System.out.print(sum +" ");
		}
	}
}