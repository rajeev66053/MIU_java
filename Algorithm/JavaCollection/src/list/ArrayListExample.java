package list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	public static void main(String args[]){ 
		
/*		Java ArrayList class can contain duplicate elements.
		Java ArrayList class maintains insertion order.
		Java ArrayList class is non synchronized.
		Java ArrayList allows random access because array works at the index basis.
		In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
		public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable 
		public interface List<E> extends Collection<E>  
		*/ 
		

		String[] array={"Java","Python","PHP","C++"}; 
		
		//convert array to list
		List<String> ll=Arrays.asList(array);
		
		System.out.println(ll);
		
		//convert list to Array
		String[] arr=ll.toArray(new String[ll.size()]);
		
		System.out.println(Arrays.toString(arr));
        
		//Java ArrayList class is non synchronized.
		//Java ArrayList allows random access because array works at the index basis.
		//In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
		//public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable 
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  //can contain duplicate value
		list.add("Ajay");  
//		list.add(null);  // allow any number of null value  
//		list.add(null);  // allow any number of null value 
		
		  System.out.println("Is ArrayList Empty: "+list.isEmpty()); 
		

		fetchData(list);

		sortingList(list);			

		fetchData(list);		 
		
		System.out.println("------Feching and updating data------");

		//accessing the element    
		System.out.println("Returning element: "+list.get(2));//it will return the 3nd element, because index starts from 0  
		//changing the element  
		list.set(2,"Hari");  
		

        fetchData(list);
		
		System.out.println("-----add data at specific index------");
		
		//Adding an element at the specific position  
        list.add(1, "Gaurav");  
        

        fetchData(list);
        
        System.out.println("All another list on the previous list");  
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add("Sonoo");  
        al2.add("Hanumat");  
        //Adding second list elements to the first list  
        list.addAll(al2);
        

        fetchData(list);
        
        System.out.println("All another list on specific index on the previous list");  
        ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul");  
        //Adding second list elements to the first list at specific position  
        list.addAll(1, al3); 
        

        fetchData(list);
        

        System.out.println("Get data having in both array list"); 
        
        ArrayList<String> al4=new ArrayList<String>();  
        al4.add("Ravi");  
        al4.add("Ajay");
        
        list.retainAll(al4);
        

        fetchData(list);
        
        list.add("Suman");
        list.add("Gopal");
        list.add("Shiv");
        list.add("Raja");
        
               
        System.out.println("Remove specific data from list by passing value");   
        //Removing specific element from arraylist  
        list.remove("Rahul");  
        
        fetchData(list);
        
        System.out.println("Remove specific data from list by passing index");   
        //Removing element on the basis of specific position  
        list.remove(4);  
        

        fetchData(list);

        System.out.println("Remove ALL  data from list2 FROM List1"); 
        list.removeAll(al2); 
        

        fetchData(list);

        System.out.println("Remove if condition meet from list"); 
        list.removeIf(str -> str.contains("Ravi")); //If list contain null values it will throw null pointer exception
        

        fetchData(list);

        System.out.println("clear all from list"); 
        list.clear(); 
        

        fetchData(list);
        
        System.out.println("Is ArrayList Empty: "+list.isEmpty()); 
        
     

	}
	
	public static void sortingList(List<String> list) {
		
		System.out.println("------Sorting------");
		//Sorting the list  
		//		  Collections.sort(list);   //If there is no null value in list collections.sort will only work.

		
		
		//		Collections.sort(list,new Comparator<String>() {   //If there is null value in list collections.sort with list and anonymouus comparator doesnot work.
		//		@Override
		//		public int compare(String s1, String s2) {
		//			// TODO Auto-generated method stub
		//			return s1.compareTo(s2); //ascending order
		////			return s2.compareTo(s1); //descending order
		//		}			
		//	});

		Collections.sort(list ,Comparator.nullsFirst((s1 ,s2) -> s1.compareToIgnoreCase(s2))); //It will sort with null value

		//		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));//It will work with null values. It will sort in natural order
		//		list.sort(Comparator.nullsLast(Comparator.reverseOrder()));//It will work with null values. It will sort in descending order

	}
	
	public static void fetchData(List<String> list){
		
		System.out.println("------Using Iterator------");
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		//maintain the insertion order
		while(itr.hasNext()){
			System.out.println(itr.next());  
		}  
		
		/*System.out.println("------For each loop------");
		//Traversing list through for-each loop  
		for(String name:list) {   
			System.out.println(name);		  
		}*/
		
		
		/*System.out.println("Traversing list through List Iterator:");  
		//Here, element iterates in reverse order  
		ListIterator<String> list1=list.listIterator(list.size());  
		
		while(list1.hasNext())  
		{  
			System.out.println("index:"+list1.nextIndex()+" value:"+list1.next()); 
			String str1=list1.next();  
			System.out.println(str1);  
		}
		
		
		while(list1.hasPrevious())  
		{  
			System.out.println("index:"+list1.previousIndex()+" value:"+list1.previous()); 
			String str=list1.previous();  
			System.out.println(str);  
		} */ 

		/*System.out.println("Traversing list through forEach() method:");  
		//The forEach() method is a new feature, introduced in Java 8.  
		list.forEach(a->{ //Here, we are using lambda expression  
			System.out.println(a);  
		});*/  


		/*System.out.println("Traversing list through forEachRemaining() method:");  
		Iterator<String> itr1=list.iterator();  
		itr1.forEachRemaining(a-> //Here, we are using lambda expression  
		{  
			System.out.println(a);  
		}); */ 

		
	}
}
