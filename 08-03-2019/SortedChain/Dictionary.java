// interface representing Dictionary
interface Dictionary<K extends Comparable<K>,V>
{
	 void insert(Pair<K,V> p);
	 void delete(K x);
	 Pair<K,V> find(K x);
	  int size();
	  boolean isEmpty();
	  void display();
}
