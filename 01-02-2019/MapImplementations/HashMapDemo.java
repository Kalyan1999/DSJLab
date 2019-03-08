import java.util.*;

public class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(4,"Hello");
		hm.put(225,"This");
		hm.put(310,"is");
		hm.put(10,"a");
		hm.put(5,"HashMap");
		hm.put(6,"Demo");
		
		
		System.out.println("\nMap: "+hm);
		Set ks=hm.keySet();
		System.out.println("\nKey Set: "+ks);
		
		Collection vc=hm.values();
		System.out.println("\nValue Collection: "+vc);
		
		Set es=hm.entrySet();
		System.out.println("\nEntry Set: "+es);
	}
}