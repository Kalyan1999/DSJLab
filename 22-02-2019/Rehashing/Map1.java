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
		MapNode<K,V> ele=new MapNode<K,V>(key,value);
		temp=buckets.get(bucketid);
		ele.next=temp;
		buckets.add(bucketid,ele);
		size++;
		double lf=(1.0*size)/numbuckets;
		
		if(lf>Default_Load_Factor)
			rehash();
	}
	
	void rehash()
	{
		ArrayList<MapNode<K,V>> temp=buckets;
		buckets=new ArrayList<MapNode<K,V>>(2*numbuckets);
		
		for(int i=0;i<2*numbuckets;i++)
			buckets.add(null);
		
		size=0;
		numbuckets*=2;
		for(int i=0;i<temp.size();i++)
		{
			MapNode<K,V> head=temp.get(i);
			while(head!=null)
			{
				K key=head.key;
				V value=head.value;
				insert(key,value);
				head=head.next;
			}
		}
	}
	
	public void display(){
		 System.out.println(buckets);
	}
}