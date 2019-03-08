import java.util.ArrayList;

public class StackImpl<T> implements StackInterface<T>
{
	ArrayList<T> sal;
	public StackImpl()
	{
		sal=new ArrayList<T>();
	}
	
	public void push(T ob)
	{
		sal.add(ob);
	}
	
	public T pop()
	{
		T temp=null;
		if(!sal.isEmpty())
		{
			temp=sal.remove(sal.size()-1);
			return temp;
		}
		return temp;
	}
	
	public int stackSize()
	{
		return sal.size();
	}
	
	public T topElement()
	{
		T temp=null;
		if(!sal.isEmpty())
		{
			temp=sal.get(sal.size()-1);
			return temp;
		}
		return temp;
	}
	
	public void display()
	{
		System.out.println("\nThe Elements in Stack are: \n"+sal+"\n\n");
	}
} 