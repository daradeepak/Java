package arrays;

import java.util.Random;

public class Main 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int a[] = new int[5];
		
		//input
		for(int i=0; i<=a.length-1; i++)
		{
			a[i] = rand.nextInt(1,10);
		}
		
		//output
		System.out.println("Output: ");
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		//even elements
		System.out.println("Even number are: ");
		for(int temp:a)
		{
			if(temp%2==0)
			{
				System.out.println(temp);
			}
		}
		
		//even indexed
		System.out.println("Even indexed elements: ");
		int sum=0;
		for(int i=0; i<=a.length-1; i++)
		{
			if(i%2==0)
			{
				System.out.println("Even indexed elements are: " +a[i]);
				sum = sum + a[i];
			}
		}
		System.out.println("Sum of even indexes is " +sum);
		
		//Copying elements from 1 array to another
		int b[] = new int[a.length];
		System.out.println("b array length: " +b.length);
		
		for(int i=0; i<=a.length-1; i++)
		{
			b[i] = a[i];
		}
		
		for(int i=0; i<=b.length-1; i++)
		{
			System.out.println("b array is " +b[i]);
		}
	}

}
