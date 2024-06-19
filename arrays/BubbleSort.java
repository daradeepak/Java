package arrays;

public class BubbleSort 
{

	public static void main(String[] args)
	{
		int a[]= new int[] {1,54,33,56,3,22,56,4,2,11};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int temp: a)
			System.out.println(temp);

	}

}
