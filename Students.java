package oops;

public class Students 
{
	int id;
	String name;
	Address a;
	
	public Students(int id,String name,Address a) 
	{
		this.id=id;
		this.name=name;
		this.a=a;
	}
	
	public void studentDetails() 
	{
		System.out.println(a.city);
		System.out.println(a.street);
		System.out.println(id);
		System.out.println(name);
	}
	
	
}
