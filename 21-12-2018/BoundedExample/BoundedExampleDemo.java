import java.util.*;

public class BoundedExampleDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n=sc.nextInt();
		
		Integer iarr[]=new Integer[n];
		
		for(int i=0;i<n;i++)
			iarr[i]=sc.nextInt();
		
		BoundedExample<Integer> obj1=new BoundedExample<Integer>(iarr);
		
		System.out.println("Average: "+obj1.average());
	}
}
