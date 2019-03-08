//class to implement sorted chain
public class SortedChain<K extends Comparable<K>,V>{
	PairNode<K,V> head;
	int dsize;
	public SortedChain(){
		head=null;
		dsize=0;
	}
	public boolean isEmpty()	{
		return(head==null);
	}
	public int size(){
		return(dsize);
	}
	public Pair<K,V> find(K x){
		if(isEmpty()){
			System.out.println("dictionary is empty");
			return null;
		}
		else
		{
			PairNode<K,V> temp=head;
			while(temp!=null&&x.compareTo(temp.data.key)>0)
					temp=temp.next;
			
			if(temp!=null&&x.compareTo(temp.data.key)<0)
			{
				System.out.println("key not found");
				return null;
			}
			else
				return(temp.data);

		}
	}
	public void insert(Pair<K,V> p){
		PairNode<K,V> npnode=new PairNode<K,V>(p,null);
		if(isEmpty())
		{
			head=npnode;
			dsize++;
			return;
		}
		else
		{
			PairNode<K,V> temp=head,prev=null;
			while(temp!=null&&p.key.compareTo(temp.data.key)>0)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null&&p.key.compareTo(temp.data.key)==0)
			{
				System.out.println("duplicate key are not allowed");
				return;
			}
			else
			{
				npnode.next=temp;
				if(prev==null)
					head=npnode;
				else
				{
					prev.next=npnode;
					dsize++;
				}
			}
		}
	}
	public void display(){
		PairNode<K,V> temp=head;
		if(isEmpty())
			System.out.println("empty dictionary");
		else
		{
			while(temp!=null)
			{
				System.out.println (""+temp.data);
				temp=temp.next;
			}
		}
	}
	public void delete(K x){
		if(isEmpty())
		{
			System.out.println("sorted chain is empty");
			return;
		}
		else
		{
			PairNode<K,V> temp=head,prev=null;
			while(temp!=null&&x.compareTo(temp.data.key)>0)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp==null||x.compareTo(temp.data.key)<0)
			{
				System.out.println("key not found");
				return;
			}
			else
			{
				if(temp==head)
					head=temp.next;
				else
				{
					prev.next=temp.next;
					dsize--;
				}
			}
		}
	}
}
