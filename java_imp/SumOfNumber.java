package java_imp;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
//		int start = 0, sum=0;		
//		while(start<=num) //0<=10
//		{
//			sum = sum+start; //0=0+
//			start++;
//		}
//		System.out.println(sum);
		
		int res=0;
		for(int i=0; i<=num; i++)
		{
			res=res+i;
		}
		System.out.println(res);

	}

}
