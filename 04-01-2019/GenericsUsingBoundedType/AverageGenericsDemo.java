import java.util.*;

public class AverageGenericsDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		System.out.println("\nEnter the Elements of array: ");
		Integer array[]=new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		
		}
		AverageGenerics<Integer> obj=new AverageGenerics<Integer>(array);
		System.out.println("\nThe Average of Integer array is: "+obj.average());
		
		Double array1[]={1.5,2.5,3.5,4.5,5.5};
		
		AverageGenerics<Double> obj1=new AverageGenerics<Double>(array1);
		System.out.println("\nThe Average of Double array is: "+obj1.average());
	}
}