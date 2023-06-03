package oops;

import java.util.Scanner;

public class JspiderDriver 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("================enter the branch name of student==================");
		String a1=s.nextLine();
		
		System.out.println("==============enter the no of students===============");
		int a2=s.nextInt();
		
		System.out.println("============enter the no.  of trainers=============");
		int a3=s.nextInt();
		
		Jspider j=new Jspider(a1,a2,a3);
		j.jspiderDetails();
		System.out.println("modify the branch name ");
		System.out.println("==============enter the branch name================");
		String a4=s.next();
		System.out.println(a4);
		System.out.println("modify the no. of students");
		System.out.println("==============enter the students================");
		int a5=s.nextInt();
		System.out.println(a5);
	}
}
