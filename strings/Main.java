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
		p.p8();
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
				s1 += s.charAt(i);	
		}
		System.out.println(s1);
		
		StringBuffer sb = new 
	}
		
}