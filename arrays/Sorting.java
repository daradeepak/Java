package arrays;

public class Sorting 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {31,42,54,33,37,25,36};
		
		for(int i=0; i<a.length-1; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int temp: a)
		{
			System.out.println(temp);
		}
		
	}

}
