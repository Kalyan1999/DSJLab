import java.util.*;

public class StackImplDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		StackImpl<Integer> obj=new StackImpl<Integer>();

		int c=0;
		
		while(c<6)
		{
			System.out.print("Available options:\n1.Push\n2.Pop\n3.Top Element\n4.Stack Size\n5.Display\n\nEnter a Choice: ");
			c=sc.nextInt();
			switch(c)
			{
				case 1: 	System.out.print("Enter an Element: ");
							int temp=sc.nextInt();
							obj.push(temp);
							break;
				case 2:System.out.println("\nElement popped is: "+obj.pop()+"\n");break;
				
				case 3:System.out.println("\nTop Element is: "+obj.topElement()+"\n");break;
				
				case 4: System.out.println("\nPresent StackSize is: "+obj.stackSize()+"\n");break;
				
				case 5:obj.display();break;
			}
		}
	}
}