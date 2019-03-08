import java.util.*;

public class MyQueueDemo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of the Queue: ");
		int n=sc.nextInt();
		MyQueue1<Double> obj=new MyQueue1<Double>(n);
		int c=0;
		
		while(c<4)
		{
			System.out.print("Available options:\n1.Enqueue\n2.Dequeue\n3.Display\n\nEnter a Choice: ");
			c=sc.nextInt();
			switch(c)
			{
				case 1: if(obj.isFull()==true)
							System.out.println("Queue OverFlow....!!");
						else
						{
							System.out.print("Enter an Element: ");
							double temp=sc.nextInt();
							obj.Enqueue(temp);
						}
						break;
				case 2:
						if(obj.isEmpty()==true)
							System.out.println("Queue UnderFlow...!!!");
						else
						{
							System.out.println("Element removed is: "+obj.Dequeue());
						}
						break;
				case 3:
					System.out.println("Queue is: ");
					obj.display();
			}
		}
	}
}