package java_imp;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		int start = 0, sum=0;		
		while(start<=num) 
		{
			sum = sum+start; 
			start++;
		}
		System.out.println(sum);

	}

}
