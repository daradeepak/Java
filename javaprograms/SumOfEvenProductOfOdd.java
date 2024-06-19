package javaprograms;

public class SumOfEvenProductOfOdd {

	public static void main(String[] args)
	{
		int num=123, rem=0, even=0, odd=0, sum=0, product=1;
		while(num>0)
		{
			rem = num%10;
			System.out.println("Number: "+rem);
			if(rem%2 == 0)
			{
				even = rem+2;
				System.out.println("After updating: "+even);
				sum = sum+even;
			}
			else
			{
				odd = rem+1;
				System.out.println("After updating: "+odd);
				product = product*odd;

			}
			num=num/10;
			
		}
		System.out.println("Sum of digits: "+sum);
		System.out.println("product of digits: "+product);
		
		int total = sum+product;
		
		System.out.println("Total: " +total);


	}

}
