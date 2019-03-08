// program to demonstrate SortedChain
import java.util.*;
public class SortedChainDemo{
	public static void main(String args[]){
		SortedChain<Integer,String> sc=new SortedChain<Integer,String>();
		Pair<Integer,String> p1=new Pair<Integer,String>(8,"ab");
			sc.insert(p1);
		Pair<Integer,String> p2=new Pair<Integer,String>(15,"mn");
			sc.insert(p2);
		Pair<Integer,String> p3=new Pair<Integer,String>(21,"yz");
			sc.insert(p3);
		Pair<Integer,String> p4=new Pair<Integer,String>(10,"PQR");
			sc.insert(p4);
		System.out.println("the elements of the sorted chain are");
			sc.display();
		System.out.println("value of 15 is "+sc.find(15));
			sc.delete(21);
			sc.display();
	}
}