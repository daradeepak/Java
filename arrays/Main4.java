package arrays;

public class Main4 
{

	public static void main(String[] args)
	{
		Problems p = new Problems();
		
		int a[] = new int[] {12,34,21,24,26,23,76,45,76};
		//p.bubbleSort(a);
        int[] sortedArray = p.selectionSort(a);
//        for(int temp:a)
//        	System.out.print(temp+" ");
        
//        p.binarySearch(sortedArray);
        
        //p.uniqueElements(a);
//        p.max(a);
        p.min(a);

	}

}

class Problems
{
	void bubbleSort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int temp:a)
			System.out.print(temp+ " ");
	}
	
	int[] selectionSort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			int min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min] > a[j])
				{
					min=j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}
	
	void binarySearch(int a[])
	{
		int first=0, last=a.length-1, search=45;
		int mid;
		
		while(first<=last)
		{
			mid = (first+last)/2;
			if(a[mid] < search)
				first = mid+1;
			else if(a[mid] == search)
			{
				System.out.println("Element found at "+(mid+1));
				break;
			}
			else
				last = mid-1;
		}
		if(first>last)
			System.out.println("Element not found");
	}
	
	void uniqueElements(int a[])
	{
		boolean b[] = new boolean[a.length];
		
		int count = 1;
		for(int i=0; i<a.length; i++)
		{
			count = 1;
			if(b[i] == true)
				continue;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					count++;
					b[j] = true;					
				}
			}
			if(count > 1)
				System.out.println(a[i]+ " "+count);
		}
		
	}
	
	void max(int a[])
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Max value is: "+max);
	}
	
	void min(int a[])
	{
		int min = Integer.MAX_VALUE;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("Min value: "+min);
	}
}
