package arrays;

public class UniqueElements 
{
    public static void main(String[] args) 
    {
        int a[] = {12,98,43,43,12,56,24,85,28,28,28,28};
        boolean b[] = new boolean[a.length];
        
//        int count=1;
        for(int i=0; i<a.length; i++)
        {
        	 int count=1;
        	if(b[i]==true)
        		continue;
        	for(int j=i+1; j<a.length; j++)
        	{
        		if(a[i] == a[j])
        		{
        			count++;
        			b[j] = true;
        		}
        	}
        	if(count>1)
        		System.out.println(a[i] );
        }

    }
}
