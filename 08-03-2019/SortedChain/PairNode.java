// class to represent a pair-node
public class PairNode<K extends Comparable<K>,V>{
	Pair<K,V> data;
	PairNode<K,V> next;
	PairNode(Pair<K,V> a,PairNode<K,V> b)
	{
		data=a;
		next=b;
	}
}
