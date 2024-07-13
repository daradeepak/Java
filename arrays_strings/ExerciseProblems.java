package arrays_strings;
import java.util.Scanner;

public class ExerciseProblems 
{

	public static void main(String[] args) 
	{
		Problems pb = new Problems();

		//Method calling 
		
//		pb.pb2();
//		pb.pb5();
		
		//Strings
//		pb.s1();
//		pb.s2();
//		pb.s3();
//		pb.s4();
//		pb.s5();
//		pb.s6();
//		pb.s7();
//		pb.s8();
//		pb.s9();
		pb.s10();
		

		
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
	
	//Strings
	void s1()
	{
		String str = "deepak";
		System.out.println(str.length());
	}
	
	void s2()
	{
		String str = "deepak";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		String rev = sb.toString();
		System.out.println(rev);
	}
	
	void s3()
	{
		String str = "deepak";
		String s = new String("deepak");
		System.out.println(str);
		System.out.println(s);
	}
	
	void s4()
	{
		String name = "deepak";
		String name1 = "deepak";
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
	}
	
	void s5()
	{
		String str = "deepak";
		for(int i=0; i<str.length(); i++)
			System.out.println(str.charAt(i));
	}
	void s6()
	{
		String str1 = "dara";
		String str2 = "deepak";
		
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
	}
	
	void s7()
	{
		String str = "deepak";
		String str2 = "dara";
		
		if(str.hashCode() == (str2.concat(str)).hashCode())
			System.out.println("Mutable");
		else
			System.out.println("Immuatable");
	}
	
	void s8()
	{
		String str = "deepak";
		int count=0;
		for(int temp: str.toCharArray())
		{
			count++;
		}
		System.out.println("String length: " +count);
	}
	
	void s9()
	{
		String str = "DeEpAk@123!";
		char ch[] = str.toCharArray();
		int upperCount=0, lowerCount=0, digitCount=0, symbolCount=0;
		
		for(char c: ch)
		{
			if(Character.isUpperCase(c))
				upperCount++;
			else if(Character.isLowerCase(c))
				lowerCount++;
			else if(Character.isDigit(c))
				digitCount++;
			else
				symbolCount++;		
		}
		System.out.println("Uppercase: "+upperCount);
		System.out.println("Lowercase: "+lowerCount);
		System.out.println("Digits: "+digitCount);
		System.out.println("Symbols: "+symbolCount);
	}
	
	void s10()
	{
		String str = "dara deepak";
		String s[] = str.split(" ");
		
		System.out.println(s.length);
	}
}
