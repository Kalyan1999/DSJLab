import java.util.*;

public class SumBoundedtypeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two integers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		SumBoundedtype<Integer> obj1=new SumBoundedtype<Integer>(a,b);
		
		System.out.println("\nSum of "+a+" and "+b+" is: "+obj1.sum());
	}
}