package java_imp;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int rem=0,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
			
//		System.out.println(temp==rev?"Palindrom":"Not a palindrome");
	}

}
