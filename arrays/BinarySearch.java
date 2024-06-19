package arrays;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {1,22,3,45,5,7,9,3,34,67,88};
		
		int min;
		for(int i=0; i<a.length-1; i++)
		{
			min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min] > a[j])
				{
					min =j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		System.out.println("Sorted array: ");
		for(int temp: a)
			System.out.print(temp+ " ");
		System.out.println("\n");
		
		int first=0, last=a.length-1, search=45;
		int count=0;
		while(first<=last)
		{
			count++;
			int mid=(first+last)/2;
			if(a[mid]<search)
				first = mid+1;
			else if(a[mid]==search)
			{
					System.out.println("Element found at " +(mid+1));
					break;
			}
			else
				last = mid-1;
		}
		if(first>last)
			System.out.println("Element not found");
		System.out.print("Number of iterations:" +count);
	}

}
