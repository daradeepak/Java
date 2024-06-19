package java_imp;

import java.util.Scanner;

public class PostiveNegative {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(num>=0)
		{
			if(num == 0)
			{
				System.out.println("Zero");
			}
			else
			{
				System.out.println("Positive");
			}
		}
		else
		{
			System.out.println("Negative");
		}

	}

}
