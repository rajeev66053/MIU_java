package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String args[]){  
		/*Java TreeSet class contains unique elements only like HashSet.
		Java TreeSet class access and retrieval times are quiet fast.
		Java TreeSet class doesn't allow null element.
		Java TreeSet class is non synchronized.
		Java TreeSet class maintains ascending order.*/
		//public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable  
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Hari");  
		set.add("Gopal");  
		set.add("Shyam");  
		set.add("Ravi");  
		set.add("Ajay"); 
		//set.add(null);//doesnot allow null value.
		//traversing elements 
		//Traverse in ascending order
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
		

		Iterator i=set.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        
        System.out.println("Reverse Set: "+set.descendingSet());  
        
        System.out.println("Head Set: "+set.headSet("Hari"));  
        
        System.out.println("SubSet: "+set.subSet("Gopal", "Vijay"));  
          
        System.out.println("TailSet: "+set.tailSet("Shyam"));  
        
        System.out.println("Head Set: "+set.headSet("Hari", true));  
         
        System.out.println("SubSet: "+set.subSet("Hari", false, "Vijay", true));  
          
        System.out.println("TailSet: "+set.tailSet("Hari", false));  
        

        System.out.println("Highest Value: "+set.pollFirst());   //first element
        System.out.println("Lowest Value: "+set.pollLast()); //last element
        
	}  
}
