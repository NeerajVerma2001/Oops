package oops;

public class Pen 
{
	String color;
	int price;
	Cap c;
	
	public Pen(String color,int price,Cap c) 
	{
		this.color=color;
		this.price=price;
		this.c=c;
	}
	
	public void penDetails() 
	{
		System.out.println(c.color);
		System.out.println(color);
		System.out.println(price);
	}
}
