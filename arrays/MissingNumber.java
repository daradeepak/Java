package arrays;

public class MissingNumber {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,6};
	
		int sum=0;
		for(int temp:a)
		{
			sum=sum+temp;
		}
		System.out.println(sum);
		
		int n=6;
		int sum1=(n*(n+1))/2;
		System.out.println(sum1);
		
		System.out.println(sum1-sum);
	}

}
