public class MinMaxDemo
{
	public static void main(String args[])
	{
		Integer iarr[]={10,20,30,40,50};
		Test t=new Test(iarr);
		
		System.out.println("Minimum Value is: "+ t.minValue()+"\nMaximum value is: "+t.maxValue());
	}
}