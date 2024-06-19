package java_imp;

public class ArmstrongRange 
{
    public static void main(String[] args) 
    {    
    	
    	for(int i=1; i<500; i++)
    	{
    		int temp=i, sum=0, count=0;
        	while(temp>0)
        	{
        		count++;
        		temp/=10;
        	}
        	temp=i;
        	while(temp>0)
        	{
        		int rem=temp%10;
        		sum = sum+(int)Math.pow(rem, count);
        		temp/=10;
        	}
        	if(i==sum)
        		System.out.println(i );
    		
    	}
    	
    }
}
