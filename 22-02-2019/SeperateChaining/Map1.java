import java.util.*;

public class Map1<K,V>
{
	public class MapNode<K,V>
	{
		K key;
		V value;
		MapNode<K,V> next;
		MapNode(K key,V value)
		{
			this.key=key;
			this.value=value;
			next=null;
		}
		
		public String toString()
		{
			return "Key: "+key+" Value: "+value+"\n";
		}
	}
	ArrayList<MapNode<K,V>> buckets;
	int size;
	int numbuckets;
	final double Default_Load_Factor=0.75;
	public Map1()
	{
		numbuckets=5;
		buckets=new ArrayList<MapNode<K,V>>(numbuckets);
		for(int i=0;i<numbuckets;i++)
			buckets.add(null);
	}
	
	int getBucketID(K key)
	{
		int code=key.hashCode();
		return (code/numbuckets);
	}
	
	void insert(K key,V value)
	{
		int bucketid=getBucketID(key);
		MapNode<K,V> temp=buckets.get(bucketid);
		
		while (temp!=null)
		{
			if(temp.key.equals(key))
			{
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		temp=buckets.get(bucketid);
		size++;
		MapNode<K,V> ele=new MapNode<K,V>(key,value);
		ele.next=temp;
		temp=ele;
		buckets.add(bucketid,ele);
	}
	
	public void display(){
		 System.out.println(buckets);
	}
}
