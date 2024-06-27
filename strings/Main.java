package strings;

public class Main 
{

	public static void main(String[] args) 
	{
		Pb p = new Pb();
		
//		p.p1();
//		p.p2();
//		p.p3();
//		p.p4();
//		p.p5();
//		p.p6();
//		p.p7();
//		p.p8();
//		p.p9();
//		p.p10();
//		p.p11();
//		p.p12();
//		p.p13();
//		p.p14();
//		p.p15();
		p.p16();
	}

}

class Pb
{
	void p1()
	{
		String s = "dara deepak";
		
			System.out.println(s.charAt(0));
	}
	
	void p2()
	{
		String s1 = "hello all good morning";
		String s2 = "Hello All good morning";
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Both strings are equal");
		else
			System.out.println("Not equal");
	}
	
	void p3()
	{
		String fName = "dara";
		String lName = " deepak";
		
		System.out.println(fName.concat(lName));
	}
	
	void p4()
	{
		String s = "good morning";
		String str = "good";
		
		System.out.println(s.contains(str));
	}
	
	void p5()
	{
		String s = "dara deepak";
		String str[] = s.split(" ");
		
		
	}
	
	void p6()
	{
		String s ="hello all";
		String res = "";
		String str[] = s.split(" ");
		
		for(String temp: str)
		{
			StringBuffer sb = new StringBuffer(temp);
			
			res = res + sb.reverse()+" ";
			
		}
		System.out.println(res);
	}
	
	void p7()
	{
		String s = "hello all good morning";
		String str[] = s.split(" ");
		String res = "";
		
		for(int i=0; i<str.length; i++)
		{
			if(i%2 !=0)
			{
				str[i] = str[i].toUpperCase();
			}
			else 
				str[i] = str[i].toLowerCase();
			
			String temp = str[i];
			
			StringBuffer sb = new StringBuffer(temp);
			sb.reverse();
			
			res = res + sb.toString()+" ";
									
		}
		System.out.println(res);			
	}
	
	void p8()
	{
		String s = "aMan&_a_plan^1&2*3ac>ana_l&&pana#ma";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			s1 += Character.toLowerCase(s.charAt(i));
		}
		System.out.println(s1);
		
		String temp = s1;
		
		StringBuffer sb = new StringBuffer(temp);
		
		sb.reverse();
		System.out.println(sb);
		
		String rev = sb.toString();
		
		if(rev.equals(s1))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
	
	void p9()
	{
		String s = "hello good morning";
		char c[] = s.toCharArray();
		
		for(char temp:c)
			System.out.println(temp);
	}
	
	void p10()
	{
		String s ="Hel";
		
		int count=1;
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++)
			{
				System.out.println(s.substring(i, j));
				count++;
			}
		}
		System.out.println("Count: 9" +count);
	}
	
	void p11()
	{
		String s = "madam arora teaches malayalam";
		String str[] = s.split(" ");
		
		for(String temp: str)
		{
			StringBuffer sb = new StringBuffer(temp);
			
			sb.reverse();
			
			String s2 = sb.toString();
			
			if(temp.equals(s2))
				System.out.println(temp);
		}
	
	}
	
	void p12()
	{
		String s = "AppLE";
		String s1 = "";
				   //aPPle
		
		for(int i=0; i<s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
				s1 += Character.toLowerCase(s.charAt(i));
			else
				s1 += Character.toUpperCase(s.charAt(i));
		}
		System.out.println(s1);
	}
	
	void p13()
	{
		StringBuilder sb = new StringBuilder("Hello");
		String s = "mom";
	
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("deepak");
		System.out.println(sb1.append(true));
		
		StringBuilder sb2 = new StringBuilder("deepak");
		StringBuilder sb3 = new StringBuilder("deepak");
		
		System.out.println(sb2.equals(sb3));
//		System.out.println(sb2.append(true));
		
//		System.out.println(s.contentEquals(sb2));
		
		
		StringBuilder sb4 = new StringBuilder("dara deepak");
		System.out.println(sb4.delete(0, 5));
		System.out.println(sb4.replace(0, 3, "hii"));
			
	}
	
	void p14()
	{	
		String s = "deepak";
		StringBuffer sb = new StringBuffer("deepak");
		
		String rev = sb.reverse().toString();
		
		if(rev.compareTo(s) == 0)
			System.out.println("Palindrome");
		else 
			System.out.println("Not a palindrome");
			
	}
	
	void p15() 
	{
	    String s = "deepak";
	    StringBuilder sb = new StringBuilder();

	    String lastTwo = s.substring(s.length()-2, s.length());
	    System.out.println(lastTwo);
	    
	    sb.append(lastTwo);

	    for(int i=0; i<s.length()-2; i++) 
	    {
	       sb.append(s.charAt(i));
	    }

	    System.out.println(sb.toString());
	}
	
	void p16() 
	{
	    String s1 = "<<>>";
	    String s2 = "world";
	    String output = "";

	    output = s1.substring(0, 2) + s2 + s1.substring(2);
	        
	    System.out.println(output); 	 
	}
}