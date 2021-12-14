package list;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String args[]){  
		//Java LinkedList class can contain duplicate elements.
		//Java LinkedList class maintains insertion order.
		//Java LinkedList class is non synchronized.
		//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
		//Java LinkedList class can be used as a list, stack or queue.
		//public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
		//public interface List<E> extends Collection<E>  
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		ll.add("Ravi");  
		ll.add("Ajay");  
		ll.add(null);  // allow any number of null value 
		ll.add(null);  // allow any number of null value 
		
		ll.add(1, "Gaurav"); 
		
		LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat"); 
        
        ll.addAll(ll2);  
        
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        ll.addAll(1, ll3);  
        
        ll.addFirst("Lokesh"); 
        
        ll.addLast("Harsh"); 
        
        ll.remove("Vijay");  
        
        ll.remove(0);
        
        ll.removeAll(ll);
        
        ll.removeFirst();
        
        ll.removeLast();  
        
        ll.removeFirstOccurrence("Gaurav");  
        
        ll.removeLastOccurrence("Harsh");  
        
        Iterator i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        
		
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
				

        ll.clear();  
		
		
	}  
}
