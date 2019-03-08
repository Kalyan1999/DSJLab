import java.util.*;

public class LinkedHashSetDemo
{
	public static void main(String args[])
	{
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("bc");
		hs.add("abc");
		hs.add("qr");
		hs.add("yz");
		hs.add("se");
		hs.add("cs");
		hs.add("ab");
		hs.add("xy");
		System.out.println(hs);
		
		System.out.println(hs.add("xyz"));
		
		System.out.println(hs);
	}
}