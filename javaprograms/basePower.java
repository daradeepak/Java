package javaprograms;
import java.util.Scanner;

public class basePower {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter thee base value: ");
		int base =sc.nextInt();
		
		System.out.print("Enter the power value: ");
		int power = sc.nextInt();
		
		int result=1;
	
		for(int i=1; i<=power; i++)
		{
			result = result*base;
		}
		System.out.println(base+"power"+power+" is "+result);
		
		sc.close();


	}

}
