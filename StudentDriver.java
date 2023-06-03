package oops;

public class StudentDriver 
{
	public static void main(String[] args) {
		Students s = new Students(21,"Neeraj",new Address("gzb",2));
		s.studentDetails();
	}
}
