//class to represent Pair

public class Pair<K,V>{
	K key;
	V value;
	public Pair(K x,V y)
	{
		key=x;
		value=y;
	}
	public String toString()
	{
		return"("+key+","+value+")";
	}
}
