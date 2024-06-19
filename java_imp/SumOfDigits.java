package java_imp;

import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int rem=0, sum=0;
		while(num>0) //133>0 13>0 1>0
		{
			rem=num%10; //3 3 1
			sum= sum+rem; //0+3=3 3+3=6 6+1=7
			num=num/10; //13 1 0
		}
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
