import java.util.*;

public class LinearSearchDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Integer iarr[]={10,20,30,40,50};
		LinearSearch ls=new LinearSearch();
		
		System.out.print("Enter Element to be found in array:");
		int b=sc.nextInt();
		
		if(ls.isIn(iarr,b))
			System.out.println("\nElement Found in Integer array.");
		else
			System.out.println("\nElement Not Found in Integer array.");
	}
}