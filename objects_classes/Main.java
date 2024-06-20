package objects_classes;

public class Main 
{

	public static void main(String[] args) 
	{
		Palindrome palindrome = new Palindrome();
		
		for(int i=1; i<=500; i++)
		{
			int reverse = palindrome.pal(i);
			if(reverse == i)
				System.out.println(i+ " Palindrome");
		}
		
	}

}

class Palindrome
{
	int pal(int num)
	{
		int rev=0, temp=num;
		
			while(temp>0)
			{
				int rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			return rev;	
	}
}
