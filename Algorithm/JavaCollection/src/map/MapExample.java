package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {  
		Map<Integer,String> map=new HashMap();  
		//Adding elements to map  
		map.put(1,"Amit");  
		map.put(5,"Rahul");  
		map.put(2,"Jai");  
		map.put(6,"Amit");  

		for(Map.Entry m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  

		//Traversing Map  
		Set set=map.entrySet();//Converting to Set so that we can traverse  
		Iterator itr=set.iterator();  
		while(itr.hasNext()){  
			//Converting to Map.Entry so that we can get key and value separately  
			Map.Entry entry=(Map.Entry)itr.next();  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}  
		
		map.entrySet()  
	      //Returns a sequential Stream with this collection as its source  
	      .stream()  
	      //Sorted according to the provided Comparator  
	      .sorted(Map.Entry.comparingByKey())  
	      //Sorted according to the provided Comparator  
//	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
	    //Sorted according to the provided Comparator  
//	      .sorted(Map.Entry.comparingByValue())  
	    //Sorted according to the provided Comparator  
//	      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
	      //Performs an action for each element of this stream  
	      .forEach(System.out::println);  


	}  
}
