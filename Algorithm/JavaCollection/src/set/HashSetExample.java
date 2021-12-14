package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String args[]){  
		/*HashSet stores the elements by using a mechanism called hashing.
		HashSet contains unique elements only.
		HashSet allows null value.
		HashSet class is non synchronized.
		HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
		HashSet is the best approach for search operations.
		The initial default capacity of HashSet is 16, and the load factor is 0.75.
		public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  
		*/
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
//		set.add(null);//allow only one null value because it doesnot allow duplicate data
		//Traversing elements  

		//the elements iterate in an unordered collection.
		//HashSet doesn't allow duplicate elements.
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		set.remove("Ravi");
		
		System.out.println(set);
		
		 HashSet<String> set1=new HashSet<String>();  
         set1.add("Ajay");  
         set1.add("Gaurav");  
         set.addAll(set1); 
         
         set.removeAll(set1);
         
         set.removeIf(str->str.contains("Vijay"));  //If there is null value in set it doesnot work
         
         
         set.clear();  
		
		
	}  
}
