package javaprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=151, rem=0, power = 3, sum=0, temp = num;
		
		while(num>0)
		{
			rem = num%10;
//			System.out.println(rem);

			int result=1;
			for(int i=1; i<=power; i++)
			{
				result = result*rem;
			}
			
//			int num1 = (int)Math.pow(rem, power);
			num=num/10;
			
			System.out.println(result);
			sum=sum+result;
			
		}
		System.out.println("Sum of digits: "+sum);
		if(sum == temp)
			System.out.println("It is a armstrong number");
		else
			System.out.println("Not a armstrong number");

	}

}
