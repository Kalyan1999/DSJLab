import java.util.*;
import java.lang.*;

public class MyStackDemo1<T extends Number>
{
	private T array[];
	private int top,size;
	
	public MyStackDemo1(int size)
	{
		this.size=size;
		top=-1;
		array=(T[])new Number[size];
	}
	
	public void push(T ele)
	{
		array[++top]=ele;	
	}
	public T pop()
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

