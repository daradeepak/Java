package java_practice_problems;

public class Main
{
	static int num = 10;
	public static void main(String[] args)
	{
		System.out.println(num);
		Main2.m1();
	}

}

class Main2
{
	static void m1()
	{
		System.out.println(Main.num);
	}
}


