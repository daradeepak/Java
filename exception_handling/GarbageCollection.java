package exception_handling;

public class GarbageCollection 
{
	public static void main(String[] args) 
	{
		GarbageCollection obj = new GarbageCollection();
		obj = null;
		System.gc();
		System.out.println("Ureference object is deleted");
	}
	@Override 
	protected void finalize()
	{
		System.out.println("Inside finalize");
	}

}
