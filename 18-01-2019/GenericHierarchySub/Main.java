public class Main
{
	public static void main(String args[])
	{
		Two<Integer> ob1=new Two<Integer>(100,1000);
		Two<String> ob2=new Two<String>("Hello",1000);
		One obj3=new One(5000);
		
		if(obj3 instanceof One)
			System.out.println("Instance of One Found...");
		if(ob2 instanceof One)
			System.out.println("Instance of One Found...");
	}
}