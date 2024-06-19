package arrays;

public class Sorting1 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {12,23,45,54,56,78,89};
		
		SortingMethods sm = new SortingMethods();
		
//		sm.bubbleSort(a);
		sm.selectionSort(a);

	}

}

class SortingMethods
{
	void bubbleSort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1-i; j++)
			{
				if(a[i] > a[j+1])
				{
					int temp = a[i];
					a[i] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int temp: a)
			System.out.println(temp);
	}
	
	void selectionSort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			int min=0;
			for(int j=i+1; j<a.length-1; j++)
			{
				if(a[min] > a[j])
				{
					min = a[j];
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for(int temp:a )
			System.out.println(temp);
	}
}
