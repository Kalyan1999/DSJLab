import java.util.*;

public class StackImpl
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of the Stack: ");
		int n=sc.nextInt();
		MyStackDemo obj=new MyStackDemo(n);
		int c=0;
		
		while(c<4)
		{
			System.out.print("Available options:\n1.Push\n2.Pop\n3.Display\n\nEnter a Choice: ");
			c=sc.nextInt();
			switch(c)
			{
				case 1: if(obj.isFull()==true)
							System.out.println("Stack OverFlow....!!");
						else
						{
							System.out.print("Enter an Element: ");
							int temp=sc.nextInt();
							obj.push(temp);
						}
						break;
				case 2:
						if(obj.isEmpty()==true)
							System.out.println("Stack UnderFlow...!!!");
						else
						{
							System.out.println("Element popped is: "+obj.pop());
						}
						break;
				case 3:
					System.out.println("Stack is: ");
					obj.display();
			}
		}
	}
}