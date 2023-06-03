package oops;

public class A 
{
	String name="Gabbar";
	int age=23;
	public void test() 
	{
		System.out.println("this is from parent class");
	}
}
class B extends A
{
	public void demo() 
	{
		System.out.println("this is from child class");
	}
}
