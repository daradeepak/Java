package java_imp;

import java.util.Scanner;
public class MpowerN {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base: ");
		int base=sc.nextInt();
		
		System.out.println("Power: ");
		int power=sc.nextInt();
		
		int result=1;
		for(int i=1; i<=power; i++)
		{
			result=result*base;
		}
		System.out.println(result);

	}

}
