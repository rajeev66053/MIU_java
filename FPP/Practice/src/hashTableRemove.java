// Java code illustrating remove() method 
import java.util.*; 
class hashTableRemove { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
			new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		// remove value for 2 from Hashtable h 
		h.remove(2); 

		// checking Hashtable h 
		System.out.println("values after remove: " + h); 
	} 
} 
