package queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {
	public static void main(String[] args) {  
		//Deque is an acronym for "double ended queue".
		//public interface Deque<E> extends Queue<E>  
		//Creating Deque and adding elements  
		/*Unlike Queue, we can add or remove elements from both sides.
		Null elements are not allowed in the ArrayDeque.
		ArrayDeque is not thread safe, in the absence of external synchronization.
		ArrayDeque has no capacity restrictions.
		ArrayDeque is faster than LinkedList and Stack.*/
		//public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable 
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay"); 
		//deque.add(null);  //doesnot allow null 
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  

		deque.offer("arvind");  
		deque.offer("vimal");  
		deque.add("mukul");  
		deque.offerFirst("jai");  
		System.out.println("After offerFirst Traversal...");  
		for(String s:deque){  
			System.out.println(s);  
		} 
		//deque.pollFirst();//it is same as poll()  
		deque.pollLast();  
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	} 
}
