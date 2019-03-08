public class Main
{
	public static void main(String args[])
	{
		Delay<Integer,String> obj1=new Delay<Integer,String>(10,"Welcome");
		System.out.println("One: "+obj1.aq+"\nTwo: "+obj1.obj);
	}
}