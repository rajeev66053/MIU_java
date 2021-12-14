package queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String args[]){  
		//public interface Queue<E> extends Collection<E> 
		//public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");  
		//queue.add(null);  //doesnot allow null
		System.out.println("head:"+queue.element());  //It is used to retrieves, but does not remove, the head of this queue.
		System.out.println("head:"+queue.peek()); //It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		queue.remove();  //It is used to retrieves and removes the head of this queue.
		queue.poll();  //It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
}
