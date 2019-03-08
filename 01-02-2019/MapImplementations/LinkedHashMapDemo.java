import java.util.*;

public class LinkedHashMapDemo
{
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
		hm.put(15,"Hello");
		hm.put(23,"This");
		hm.put(36,"is");
		hm.put(42,"a");
		hm.put(56,"HashMap");
		hm.put(64,"Demo");
		
		
		System.out.println("\nMap: "+hm);
		Set ks=hm.keySet();
		System.out.println("\nKey Set: "+ks);
		
		Collection vc=hm.values();
		System.out.println("\nValue Collection: "+vc);
		
		Set es=hm.entrySet();
		System.out.println("\nEntry Set: "+es);
	}
}