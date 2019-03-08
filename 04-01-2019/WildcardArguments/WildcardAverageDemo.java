import java.util.*;

public class WildcardAverageDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		System.out.println("\nEnter the Elements of Integer array: ");
		Integer iarray[]=new Integer[n];
		
		for(int i=0;i<n;i++)
		{
			iarray[i]=sc.nextInt();
		
		}
		WildcardAverage<Integer> obj=new WildcardAverage<Integer>(iarray);
		
		Double darray[]=new Double[n];
		System.out.println("\nEnter the Elements of Double array: ");
		
		for(int i=0;i<n;i++)
		{
			darray[i]=sc.nextDouble();
		
		}		
		
		WildcardAverage<Double> obj1=new WildcardAverage<Double>(darray);
		
		System.out.println("\nThe Average of Integer array is: "+obj.average());
		System.out.println("\nThe Average of Double array is: "+obj1.average());
		
		if(obj.sameAvg(obj1))
		{
			System.out.println("\nAverages of both arrays are same");
		}
		else
		{
			System.out.println("\nAverages of both arrays are different");
		}
	}
}  