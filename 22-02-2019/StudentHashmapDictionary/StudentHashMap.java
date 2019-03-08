import java.util.*;

public class StudentHashMap
{
	public static void main(String args[])
	{
		HashMap<Integer,Student> hm=new HashMap<Integer,Student>();
		hm.put(01,new Student(01,"Rahul","ECE"));
		hm.put(02,new Student(02,"Ritesh","BBA"));
		hm.put(03,new Student(03,"Koushik","ECE"));
		hm.put(04,new Student(04,"Nithish","CIV"));
		
		System.out.println("Values: "+hm);
	}
}