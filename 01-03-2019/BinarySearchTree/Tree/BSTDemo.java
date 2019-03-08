//BST main
import java.util.*;
public class BSTDemo{
public static void main(String []args){
	char flag;
	BSTDictionaryImpl<Integer,String> bst=new BSTDictionaryImpl<Integer,String>();
	Scanner sc=new Scanner(System.in);

	do
	{
		System.out.println("select an option from the following:");
		System.out.println("1.insert");
		System.out.println("2.delete");
		System.out.println("3.find");
		System.out.println("4.display");
		System.out.println("5.size");
		System.out.println("6.exit");
		int s=sc.nextInt();
		switch(s)
		 {
		 case 1:System.out.println("enter key");
		            int i=sc.nextInt();
		            System.out.println("enter string");
		            String st=sc.next();
		            Node<Integer,String> p=new Node<Integer,String>(i,st);
		            bst.insert(p);
		            break;
		 case 2:System.out.println("enter a key to be deleted");
		            int j=sc.nextInt();
		            bst.delete(j);
		            break;
		 case 3:System.out.println("enter a key");
		            int k=sc.nextInt();
	                              Node<Integer,String> p1=bst.find(k);
		           System.out.println(p1);
		            break;
		 case 4: bst.display();
		             break;
		 case 5: System.out.println(" size = "+bst.size());
 }
System.out.println("do u want to continue:y or n");
flag=sc.next().charAt(0);
}while(flag=='y');
}
}
