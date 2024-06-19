package java_imp;

import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int start=2, count=0;
		while(start<=num) 
		{
			if(num%start==0)
			{
				count++;
			}
			start++;
		}
		if(count == 2)
			System.out.println("Prime");
		else
			System.out.println("Not prime");

	}

}
