package arrays;

public class Deletion 
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int delete_idx = 4;
		
		int i;
		for( i= delete_idx; i<a.length-1; i++)
		{
			a[i] = a[i+1];
		}

		
		for(int t:a)
			System.out.print(t+" ");

	}

}
