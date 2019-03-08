import java.util.*;

public class NavigableSetDemo
{
	public static void main(String args[])
	{
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("bc");
		hs.add("abc");
		hs.add("qr");
		hs.add("yz");
		hs.add("se");
		hs.add("cs");
		hs.add("ab");
		hs.add("xy");
		
		System.out.println("List: \n"+hs+"\n");
		
		System.out.println(hs.add("xyz"));
		
		System.out.println("\nList: \n"+hs);
		
		System.out.println("\n\nCeiling: "+hs.ceiling("bc"));
		
		System.out.println("Floor: "+hs.floor("bc"));
		
		System.out.println("Higher: "+hs.higher("bc"));
		
		System.out.println("Lower: "+hs.lower("bc"));
		
		System.out.println("Iterator: "+hs.descendingSet());
	}
}