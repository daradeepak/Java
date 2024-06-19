package arrays;

public class Insertion 
{

	public static void main(String[] args)
	{
//		int a[] = {10,20,30,40,50,60,70,0};
//		int insert_idx=3, insert=80;
//		
//		int i;
//		for(i=a.length-1; i>insert_idx; i--)
//		{
//			a[i] = a[i-1];
//		}
//		a[i] = insert;
//		
//		for(int t:a)
//			System.out.print(t+" ");

			int a[] = {1,2,3,4,5,6,7};
			
			
		for(int r=1; r<=2; r++)
		{
			int temp = a[0];

			int i;
			for(i=0; i<a.length-1; i++)
			{
				a[i] = a[i+1];
			}
			a[i]=temp;
			
			for(int t:a)
			{
				System.out.print(t+" ");
			}
			System.out.println();
		}
		

	}

}
