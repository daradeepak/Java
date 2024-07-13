package exception_handling;

public class ExceptionHandling 
{
    public static void main(String[] args) 
    {
   
        throw new ClassLateException("Class late exception");
    }
}

class ClassLateException extends RuntimeException
{
    public ClassLateException(String msg) 
    {
        super(msg);
    }
}

//class StudentLateException extends Exception
//{
//	public StudentLateException()
//	{
//		super("Class late exception");
//	}
//	public StudentLateException(String msg)
//	{
//		super(msg);
//	}
//}
