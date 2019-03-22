//class to implement Min Priority Queue
import java.util.*;
public class MinHeap<E extends Comparable<E>> implements MinPriorityQueue<E>{
	private ArrayList<E> heap;
	public MinHeap(){
		heap = new ArrayList<E>();
	}
	public E extractMin(){
		if(heap.size()<=0)
			return null;
		else{
			E min = heap.get(0);
			heap.set(0,heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			minHeapify(heap,0);
			return min;
		}
	}
	public void insert(E element){
		heap.add(element);
		int location = heap.size()-1;
		while(location>0 && heap.get(location).compareTo(heap.get(parent(location)))<0)
		{
			swap(heap, location, parent(location));
			location = parent(location);
		}
	}
	public boolean isEmpty(){
		return heap.size()==0;
	}
	public E minimum(){
		if(heap.size()<=0)
			return null;
		else
			return heap.get(0);
	}
	private <E extends Comparable<E>> void minHeapify(ArrayList<E> a, int i){
		int left = leftChild(i);
		int right = rightChild(i);
		int smallest;
		if(left<=a.size()-1 && a.get(left).compareTo(a.get(i))<0)
			smallest = left;
		else
			smallest = i;
		if(right<=a.size()-1 && a.get(right).compareTo(a.get(smallest))<0)
			smallest = right;
		if(smallest != i){
			swap(a, i, smallest);
			minHeapify(a, smallest);
		}
	}
	private <E> void swap(ArrayList<E> a, int i, int j){
		E temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}
	private int leftChild(int i){
		return 2*i + 1;
	}
	private int rightChild(int i){
		return 2*i + 2;
	}
	private int parent(int i){
		return (i-1)/2;
	}
	public void display(){
		System.out.println(heap);
	}
	public  void sort(){
		int len = heap.size();
		for(int i=len/2-1; i>=0; i--)
			minHeapify(heap,i);
		for(int i=len-1; i>=0; i--){
			E temp = heap.get(0);
			heap.set(0,heap.get(i));
			heap.set(i,temp);
			minHeapify(heap,i);
		}
		
	}
}


 