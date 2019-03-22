//interface Min Priority Queue
import java.util.*;
public interface MinPriorityQueue<E extends Comparable<E>>{
	public E extractMin();
	public void insert(E element);
	public boolean isEmpty();
	public E minimum();
}
