package arrays;

public class SecondLargest 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {11,23,45,54,32,67,89,77,66,43,23,12};
		
		int min;
		for(int i=0; i<a.length; i++)
		{
			min=i;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for(int temp:a)
			System.out.println(temp);

		for(int i=a.length-2; i>=0; i--)
		{
			if(a[a.length-1] != a[i])
				System.out.println("Second largest: " +a[i] +" "+ a[a.length-1]);
			break;
		}
	}

}
