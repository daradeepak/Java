package arrays;



import java.util.Random;
import java.util.Scanner;

public class Main2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Arrays arrays = new Arrays();
		
		
		int a[] = new int[5];
	
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = rand.nextInt(1,50) ;
		}

		System.out.println("Arrays values: ");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	
		 arrays.maxElement(a);	
		 arrays.minElement(a);

	}

}

class Arrays
{
	
	void maxElement(int a[])
	{
		int max=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(max<a[i]) 
			{
				max= a[i]; 
			}
		}
		System.out.println("Maximum element is: " +max);
		
	}
	
	void minElement(int a[]) 
	{
		int min = Integer.MAX_VALUE; //-32424342
		
		for(int i=0; i<=a.length-1; i++)
		{
			if(min>a[i]) //-333 > 42
			{
				min=a[i];
			}
		}
		System.out.println("Minimum element is: "+min);
		
	}
}
