package java_patterns;

public class Main 
{

	public static void main(String[] args) 
	{ 
//		for(int i=1; i<=6; i++)
//		{
//			for(int j=1; j<=6; j++)
//			{
//				if(i==1 || i==6 || j==1 || j==6)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1 || i==5 || j==1 || j==5 || i==j || i+j==6)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				if(i==j || i+j==6)
//					System.out.print("$ ");
//				else if((i==2 && j==3) || (i==3 && j==2) || (i==3 && j==4) || (i==4 && j==3))
//					System.out.print("+ ");
//				else
//					System.out.print("# ");
//			}
//			System.out.println();
//		}
		
		
//		int num=0, num2=9;
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				System.out.print(num++ +" ");
//			}
//			System.out.println();
//		}

		
//		int num1=0, num2=9;
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=5; j++)
//			{
//				if(i%2!=0)
//				{
//					num1 = num1>9?0:num1;
//					System.out.print(num1++ +" ");
//				}
//				else
//				{
//					num2=num2<0?9:num2;
//					System.out.print(num2-- +" ");
//				}
//			}
//			System.out.println();
//		}
		
//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=4; j++)
//			{
//				if(i==1|| j==1 || i+j==5)
//				{
//					System.out.print("# ");
//				}
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
//		int rows=4, cols=5, num=0;
//		for(int i=0; i<rows; i++)
//		{
//			for(int j=0; j<cols; j++)
//			{
//				if(i==0)
//					System.out.print(j+ " ");
//				else if(i==1)
//					System.out.print((9-j)+ " ");
//				else if(i==2)
//					System.out.print((j+5)+ " ");
//				else if(i==3)
//					System.out.print((4-j)+ " ");
//
//			}
//			System.out.println();
//		}
		
	
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				if(i==j || i==1 || j==1 || i==5)
//				{
//					System.out.print("# ");
//				}
//				else
//					System.out.print("$ ");
//			}
//			System.out.println();
//		}
	
		
//		for(int i=1; i<=5; i++) //1<=5 
//		{
//			for(int j=1; j<=i; j++) //1<=1
//			{
//				if(i==1 || j==1 || i==j )
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//					
//			}
//			System.out.println();
//		}
//		for(int i=5-1; i>=1; i--) //5>=1
//		{
//			for(int j=1; j<=i; j++) // 1<=5
//			{
//				if(i==1 || j==1 || i==j )
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	
		
//		
//		for(int i=5; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				if(i==5 || j==1 || i==j)
//				{
//					System.out.print("* ");
//				}
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
//		for(int i=2; i<=5; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				if(i==5 || j==1 || i==j)
//				{
//					System.out.print("* ");
//				}
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
	
		
//		for(int i=5; i>=1; i--) //5>=1
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("- ");
//			}
//			for(int k=5; k>=i; k--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

		
//		for(int i=4; i>=1; i--) //5>=1
//		{
//			for(int j=1+1; j<=i; j++) //1<=5
//			{
//				System.out.print("  ");
//			}
//			for(int k=4; k>=i; k--)
//			{
//				System.out.print("# ");
//			}
//            for (int j = 5; j >= i; j--)
//            {
//                System.out.print("# ");
//            }
//			System.out.println();
//			}
			
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1+1; j<=i; j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=5; k>=i; k--)
//			{
//				if(i==1 || k==5 || i==k)
//				{
//					System.out.print("# ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
	
		
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=5; j>i; j--)
//			{
//				System.out.print("- ");
//			}
//			for(int k=1; k<=i; k++)
//			{
//				if(i==5 || i==k|| k==1)
//				{
//					System.out.print("# ");
//				}
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1; i<5; i++)
//		{
//			for(int j=1; j<i; j++)
//			{
//				System.out.print("  ");
//			}
//			for(int j=5; j>=i; j--)
//			{
//				if(i==1 || i==j || j==5)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=5; j>i; j--)
//			{
//				System.out.print("  ");
//			}
//			for(int j=1; j<=i; j++)
//			{
//				if(i==j || i==5 || j==1)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}	
		
		

	}

}




