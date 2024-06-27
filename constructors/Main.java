package constructors;

public class Main
{

	public static void main(String[] args)
	{
//		Student s = new Student();
//		Student s1 = new Student(80);
		Student sd = new Student(80.78);
		sd.Display();
	}
}

class Student
{
	String studentName;
	int studentRoll;
	double studentPercentage;
	
	Student()
	{
		this.studentName = "Deepak";
		this.studentRoll = 101;
	}
	
	Student(double studentPercentage)
	{
		this();
		this.studentPercentage = studentPercentage;
	}
	
	void Display()
	{
		System.out.println(studentName+ " "+studentRoll+" "+studentPercentage+"%");
	}
}