// Java code illustrating values() method 
import java.util.*; 
class hashTableValues { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
				new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		// creating set view for hash table 
		Set s = h.entrySet(); 

		// checking collection view of values 
		System.out.println("collection values: " + h.values()); 
	} 
}
