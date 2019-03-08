import java.util.*;

public class MyQueue
{
	private int array[];
	private int front,rear,size;
	
	public MyQueue(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		array=new int[size];
	}
	
	public void Enqueue(int ele)
	{
		array[++rear]=ele;	
	}
	public int Dequeue()
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
