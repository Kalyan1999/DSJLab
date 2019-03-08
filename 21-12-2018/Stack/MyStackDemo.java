import java.util.*;

public class MyStackDemo
{
	private int array[];
	private int top,size;
	
	public MyStackDemo(int size)
	{
		this.size=size;
		top=-1;
		array=new int[size];
	}
	
	public void push(int ele)
	{
		array[++top]=ele;	
	}
	public int pop()
	{
		return array[top--];
	}
	public boolean isFull()
	{
		return (top==size-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public void display()
	{
		for(int i=top;i>-1;i--)
		{
			System.out.println(array[i]);
		}
	}
}

