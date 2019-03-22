//program to implement MinHeap
import java.util.*;
public class MinHeapDemo {
	public static void main(String []args){
		MinHeap<Integer> mh = new MinHeap<Integer>();
		mh.insert(10);
		//mh.display();
		mh.insert(1);
		mh.insert(5);
		mh.insert(3);
		mh.insert(2);
		mh.insert(6);
		mh.display();
		Integer d = mh.extractMin();
		System.out.println(d);
		mh.display();
		mh.insert(4);
		mh.display();
		mh.insert(11);
		mh.display();
		d = mh.extractMin();
		System.out.println(d);
		mh.display();
		ArrayList<Integer> t = new ArrayList<Integer>();
		mh.sort();
		mh.display();

		mh.sort();
		mh.display();

		mh.insert(9);
		mh.insert(8);
		mh.insert(7);
		mh.display();
		mh.sort();
		mh.display();

	}
}
		