package java_patterns;

public class Pattern4 {

	public static void main(String[] args) {
		for(int r=1; r<=5; r++)
		{
			for(int c=r; c>=1; c--)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
