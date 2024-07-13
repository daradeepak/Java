package oops;

public class PQ1
{

	public static void main(String[] args) 
	{
//		Person p = new Person();
//		Circle c = new Circle();
//		System.out.println("Area of the circle: " +c.areaOfCircle());
//		System.out.println("Circumfernce of the circle: " +c.circumfernceOfCircle());
		
//		Dog d = new Dog("Bommer", "Doberman");
//		System.out.println("Before setting: "+d.getName());
//		System.out.println("After setting: "+d.setName("Brownie"));
//		
//		System.out.println("Before setting: "+d.getBreed());
//		System.out.println("After setting: "+d.setBreed("German Shepeard"));
			

	}

}

class Person
{
	private String name;
	private int age;
	
	Person()
	{
		this.name = "Deepak";
		this.age = 21;
		
		System.out.println(name + " "+age);
	}

}

class Dog
{
	String name;
	String breed;
	
	Dog(String name, String breed)
	{
		this.name = name;
		this.breed = breed;	
	}
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public String getBreed()
	 {
		 return breed;
	 }
	 
	 public String setName(String name)
	 {
		 return name;
	 }
	 
	 public String setBreed(String breed)
	 {
		 return breed;
	 }
}


class Circle
{
	final double PI = 3.14;
	int radius = 3;
	double areaOfCircle()
	{
		return PI*radius*radius;
	}
	double circumfernceOfCircle()
	{
		return 2*PI*radius;
	}
}

class Employee
{
	String name;
	String job_title;
	double base_salary;
	double da;
	double hra;
	double monthly_salary;
	
	Employee()
	{
		this.base_salary = 18000;
		this.da = 3000;
		this.hra = 5000;
	}
	
	void calculateSalary(double base_salary, double da, double hra)
	{
		this.base_salary = base_salary;
		this.da = da;
		this.hra = hra;
		
		monthly_salary = base_salary+da+hra;
		
	}
	

}


