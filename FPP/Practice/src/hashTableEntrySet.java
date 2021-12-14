// Java code illustrating entreysent() method 
import java.util.*; 
class hashTableEntrySet { 
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

		// printing set entries 
		System.out.println("set entries: " + s); 
	} 
}
