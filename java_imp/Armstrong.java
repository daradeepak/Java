	package java_imp;
	
	import java.util.Scanner;
	public class Armstrong {
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number");
			int num = sc.nextInt();
			
			System.out.println("Enter power value: ");
			int power = sc.nextInt();
		
			int rem=0, sum=0, result=1, temp=num;
			for(int i=0; i<=power;i++)
			{
				result=result*power;
			}
			while(num>0)
			{
				rem=num%10;
				sum = sum + result;
				num=num/10;
			}
			
			if(sum == temp)
				System.out.println("Armstrong number");
			else
				System.out.println("Not an armstrong number");
	
		}
	
	}
