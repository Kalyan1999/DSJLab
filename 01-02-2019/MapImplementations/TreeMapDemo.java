import java.util.*;

public class TreeMapDemo
{
	public static void main(String args[])
	{
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("One","Hello");
		tm.put("Two","This");
		tm.put("Three","is");
		tm.put("Four","a");
		tm.put("Five","Treemap");
		tm.put("Six","Demo");
		
		
		System.out.println("\nMap: "+tm);
		
		Set ks=tm.keySet();
		System.out.println("\nKey Set: "+ks);
		
		Collection vc=tm.values();
		System.out.println("\nValue Collection: "+vc);
		
		Set es=tm.entrySet();
		System.out.println("\nEntry Set: "+es);
		
		//Sending the EntrySet obtained into an Iterator
		Iterator<Map.Entry> itr=es.iterator();
		
		while(itr.hasNext())
		{
			//Map.Entry variable
			Map.Entry me=itr.next();
			//Printing the Key-Value Pair
			System.out.println(me.getKey()+" : "+me.getValue());
			//Changing the Value for a key provided
			if(me.getKey().equals("Five"))
				me.setValue("IteratorTreeMap");
		}
		System.out.println("\n Final Tree Map is: \n\n"+tm);
		
		
	}
}