public class TestDemo
{
	public static void main(String args[])
	{
		Test<Integer,Integer> ob1=new Test<Integer,Integer>(2,100);
		System.out.println("Sum is: "+(ob1.getA()+ob1.getB()));
		
		Test<String,String> ob2=new Test<String,String>("Hello, ","World...!!!");
		System.out.println(ob2.getA()+ob2.getB());
		
	}
}