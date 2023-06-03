package oops;

public class Jspider 
{
	//declare the variabloes of a class as private
	
	private String bname;    //r/w
	private int students;		//w
	private int trainers;		//r
	
	public Jspider(String bname, int students,int trainers) 
	{
		this.bname=bname;
		this.students=students;
		this.trainers=trainers;
	}
	
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}



	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}



	/**
	 * @return the students
	 */
	public int getStudents() {
		return students;
	}



	/**
	 * @param students the students to set
	 */
	public void setStudents(int students) {
		this.students = students;
	}



	/**
	 * @return the trainers
	 */
	public int getTrainers() {
		return trainers;
	}



	/**
	 * @param trainers the trainers to set
	 */
	public void setTrainers(int trainers) {
		this.trainers = trainers;
	}



	//provide the public getter and setter method to view and modify the variables values
	public void jspiderDetails()
	{
		System.out.println(getBname());
		System.out.println(getTrainers());
	}
	
}
