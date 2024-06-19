package java_practice_problems;

import java.util.Scanner;

public class CoPrime 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		
		int hcf=0;
		for(int i=1; i<=a || i<=b; i++)
		{
			if(a%i==0 && b%i==0 )
			{
					hcf=i;
					System.out.println(hcf);
			}

		}
		System.out.println(hcf);


		if(hcf==1)
			System.out.println("co-prime");
		else
			System.out.println("not a co prime");


	}

}
