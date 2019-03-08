import java.util.*;

public class GenericSortDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		Integer arr[]=new Integer[n];
		System.out.println("Enter the elements of Array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		GenericSort<Integer> obj=new GenericSort<Integer>(arr);
		System.out.println("Sorted Array is: ");
		obj.sortArray();
	}
}