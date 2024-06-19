package strings;

public class Main 
{

	public static void main(String[] args) 
	{
		Problems p = new Problems();
		
//		p.p1();
		p.p2();

	}
}

class Problems
{
	void p1()
	{
		String s = "hello all good morning";
		String a[] = s.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			if(i%2 == 0)
				a[i] = a[i].toUpperCase();
			else 
				a[i] = a[i].toLowerCase();
		}


		for(String temp:a)
			System.out.println(temp);
		
	}
	
	void p2()
	{
		String s = "Vital Information Resource Under Sesieze";
		String a[] = s.split(" ");
		
		String res="";
		for(int i=0; i<a.length; i++)
		{
			res = res+a[i].charAt(0);
		}
		System.out.println(res);

	}
	
	
}
