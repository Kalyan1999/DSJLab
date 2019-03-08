import java.util.LinkedList;

public class StackImpl<T> implements StackInterface<T>
{
	LinkedList<T> sll;
	public StackImpl()
	{
		sll=new LinkedList<T>();
	}
	
	public void push(T ob)
	{
		sll.add(ob);
	}
	
	public T pop()
	{
		T temp=null;
		if(!sll.isEmpty())
		{
			temp=sll.removeFirst();
			return temp;
		}
		return temp;
	}
	
	public int stackSize()
	{
		return sll.size();
	}
	
	public T topElement()
	{
		T temp=null;
		if(!sll.isEmpty())
		{
			temp=sll.getFirst();
			return temp;
		}
		return temp;
	}
	
	public void display()
	{
		System.out.println("\nThe Elements in Stack are: \n"+sll+"\n\n");
	}
} 