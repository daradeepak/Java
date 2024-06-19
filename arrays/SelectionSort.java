package arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {11,98,34,65,78,33,12,42,89,66,99};
		
		int min=0;
		for(int i=0; i<a.length; i++)
		{
			min=i;
			for(int j=i+1; j<a.length-1; j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int temp:a)
			System.out.println(temp);
	}

}
