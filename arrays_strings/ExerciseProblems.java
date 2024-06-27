package arrays_strings;
import java.util.Scanner;

public class ExerciseProblems 
{

	public static void main(String[] args) 
	{
		Problems pb = new Problems();

		//Method calling 
		
//		pb.pb2();
		pb.pb5();
		
	}
}

class Problems
{
	void pb2()
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[6];
		System.out.println("Enter array values: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}	
		
		sc.close();
		
		int arrCount=0;
		for(int temp: a)
		{
			System.out.println(temp);
			arrCount++;
		}
		System.out.println("Length: "+a.length);
		System.out.println("Array count without length: "+arrCount);
	}
	void pb5()
	{
		int a[] = new int[]{12,56,34,23,67,76,32,75,90,345};
		
		System.out.println("Reverse order: ");
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		
		// Mid point 
		int midPoint = a.length/2;
		
		//Storing array values
		int firstHalf[] = new int[midPoint];
		int secondHalf[] = new int[a.length-midPoint];
		
		System.out.print("First half: ");
		for(int i=0; i<midPoint; i++)
		{
			firstHalf[i] = a[i];
		}
		for(int temp:firstHalf)
			System.out.print(temp+" ");
		
		System.out.println("\n");
		
		System.out.print("Second half: ");
		for(int i=midPoint; i<a.length; i++)
		{
			secondHalf[i-midPoint] = a[i];
		}
		for(int temp: secondHalf)
			System.out.print(temp+" ");
		
		System.out.println("");
		
			
	}
}
