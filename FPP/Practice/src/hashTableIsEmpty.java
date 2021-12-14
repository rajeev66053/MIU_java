// Java code illustrating isEmpty() method 
import java.util.*; 
class hashTableIsEmpty { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
			new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		// clear hash table h 
		h.clear(); 

		// checking whether hash table h is empty or not 
		if (h.isEmpty()) 
			System.out.println("yes hash table is empty"); 
	} 
} 
