public class Student
{
	int rollno;
	String name;
	String branch;
	public Student(int rollno,String name,String branch)
	{
		this.name=name;
		this.rollno=rollno;
		this.branch=branch;
	}
	
	public String toString()
	{
		return "Name: "+name+" Branch: "+branch+"\n";
	}
}