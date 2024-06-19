package javaprograms;

public class ReverseNum {

	public static void main(String[] args) {
		int num = 121, rem=0, sum=0, count=0;
		
		while(num>0)
		{
			rem = num%10;
			System.out.println(rem);
			count++;
			sum = sum+rem;
			num = num/10;
		}
		if(count == sum)
			System.out.println("Same");
		else
			System.out.println("not same");

	}

}
