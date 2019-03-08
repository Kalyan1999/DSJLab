import java.util.*;
import java.lang.*;
public class MyQueue1<T>
{
	private T array[];
	private int front,rear,size;
	
	public MyQueue1(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		array=(T[])new Object[size];
	}
	
	public void Enqueue(T ele)
	{
		array[++rear]=ele;	
	}
	public T Dequeue()
	{
		return array[front++];
	}
	public boolean isFull()
	{
		return (rear==size-1);
	}
	public boolean isEmpty()
	{
		return (rear==-1||front>=rear);
	}
	public void display()
	{
		if(front==-1)
			front=0;
		for(int i=front;i<=rear;i++)
		{
			System.out.println(array[i]);
		}
	}
}
