package strings;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s = "deepak";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
			System.out.println("Palindrome");
		else 
			System.out.println("Not a palindrome");
	}

}
