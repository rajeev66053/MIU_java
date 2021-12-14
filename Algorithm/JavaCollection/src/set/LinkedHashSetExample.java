package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String args[]){  
		/*Java LinkedHashSet class contains unique elements only like HashSet.
		Java LinkedHashSet class provides all optional set operation and permits null elements.
		Java LinkedHashSet class is non synchronized.
		Java LinkedHashSet class maintains insertion order.
		public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable  
		*/
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add(null);//allow only one null value because it doesnot allow duplicate data
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
	}  
}
