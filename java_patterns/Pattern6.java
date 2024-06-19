package java_patterns;
public class Pattern6 
{
    public static void main(String[] args) 
    {
        int number = 1; 

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++; 
            }
            System.out.println(); 
        }
    }
}
		
//	for(int r=1; r<=5; r++)
//	{
//		for(int j=1; j<=r; j++)
//		{
//			System.out.print(r);
//		}
//		System.out.println();
//	}
//	
		
//		1
//		23
//		456
//		78910
//}
//		
//}

