package objects_classes;

public class Main2 
{

	public static void main(String[] args) 
	{
		Problems p = new Problems();
		p.armstrong();
	}
}

class Problems
{
	int armstrong()
	{
		for(int i=0; i<500; i++)
		{
			int sum=0, count=0;
			int temp = i;
			
			while(temp>0)
			{
				temp/=10;
				count++;
			}
			temp = i;
			while(temp>0)
			{
				int rem = temp%10;
				sum = sum + (int)Math.pow(rem, count);
				temp/=10;			
			}
			if(sum == i)
				return i;

		}
		return 0;
		
	}
}
