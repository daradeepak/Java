package arrays;

public class Main3 
{

	public static void main(String[] args) 
	{
		int[] a[] = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		
//		System.out.println("Before transpose: ");
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				System.out.print(a[i][j] +" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("After transpose: ");
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				System.out.print(a[j][i] +" ");
//			}
//			System.out.println();
//		}
//		System.out.println("After adding: ");
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				System.out.print(a[i][j] + a[j][i] +" ");	
//			}
//			System.out.println();
//		}
		
//		System.out.println("Sum: ");
//		{
//			int sum=0;
//			for(int i=0; i<3; i++)
//			{
//				for(int j=0; j<3; j++)
//				{
//					sum = sum+ a[i][j] + a[j][i];
//					System.out.print(sum+" ");
//				}
//				System.out.println();
//			}
//		}
//		
//		System.out.println("Diagonal: ");
//		for(int i=0; i<3; i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				if(i+j==3-1)	
//					System.out.print(a[i][j]+" ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
		
//		System.out.println("Adding row: ");
//		{
//			for(int i=0; i<3; i++)
//			{
//				int sum=0;
//				for(int j=0; j<4; j++)
//				{
//					if(i<=2 && j<=2)
//					{
//						System.out.print(a[i][j]+ " ");
//						sum = sum + a[i][j];
//					}
//					else
//						System.out.print(sum);
//				}
//				System.out.println();
//			}
		
		System.out.println("Sum: ");
		{
			for(int i=0; i<3; i++)
			{
				int max=0;
				for(int j=0; j<3; j++)
				{
					if( max < a[i][j])
					{
						max=a[i][j];
					}
					System.out.print(a[i][j] +" ");	
				}
				System.out.println();		
			}
		}
		
		
		}
	}
