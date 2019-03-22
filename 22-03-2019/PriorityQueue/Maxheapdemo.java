import java.util.Scanner;
import java.util.ArrayList;
public class Maxheapdemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int ne=sc.nextInt();
		ArrayList<Integer> alist=new ArrayList<Integer>(ne);
		alist.add(-1);
		System.out.println("enter the elements");
		for(int i=1;i<=ne;i++)
 			 alist.add(sc.nextInt());
 
		Heap h=new Heap();
		h.Heapinitialize(alist,ne);
		System.out.println("elements before sorting");
			h.display();
		System.out.println("elements after sorting");
			h.Heapsort();
		h.display();
			System.out.println(h.top()+" ");
		h.pop();
		h.display();
	}
}


