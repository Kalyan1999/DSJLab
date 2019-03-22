import java.util.ArrayList;
public class Heap
{
	ArrayList<Integer> al;
	int n;
	public Heap( ){
		n=0;
	}

	int top(){
		return(al.get(1));
	}

	public void Heapinitialize(ArrayList<Integer> arr,int ne){
		al=arr;
		n=ne;
		for(int i=n/2;i>=1;i--)
			Heapify(al,i,n);
	}
	
	void pop(){
		al.set(0,al.get(n));
		n--;
		Heapify(al,1,n-1);	
	}
	public void Heapsort(){
		int temp;
		for(int i=n;i>=1;i--)
		{
			temp=al.get(1);
			al.set(1,al.get(i));
			al.set(i,temp);
			Heapify(al,1,i-1);
		}
	}
	public void display()	{
		for(int i=1;i<=n;i++)
 			 System.out.print(al.get(i)+" ");
 		System.out.println();
	}
	
	void Heapify(ArrayList<Integer> al,int i,int n){
		int child=2*i;
		int element=al.get(i);
		while(child<=n)
		{
		if(child<n&&al.get(child+1)>al.get(child))
			child=child+1;
		if(element>al.get(child))
			 break;
		else{
			al.set(child/2,al.get(child));
			child=child*2;
		       }
		}
		al.set(child/2,element);
	}
}
