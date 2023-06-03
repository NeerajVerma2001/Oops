package oops;

public class PenDriver 
{
	public static void main(String[] args) {
		Pen p = new Pen("blue",10,new Cap("black"));
		p.penDetails();
	}
}
