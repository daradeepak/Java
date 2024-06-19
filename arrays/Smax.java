package arrays;

public class Smax 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {2,3,4,8,13,45,67,87,88,90,98,98,101};

		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
				max = a[i];	
		}
		System.out.println(max);
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > smax && a[i]!=max)
				smax = a[i];
		}
		System.out.println(smax);

	}

}
