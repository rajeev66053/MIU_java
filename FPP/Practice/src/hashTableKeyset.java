// Java code illustrating keySet() method 
import java.util.*; 
class hashTableKeyset { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
			new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		// creating set view for keys 
		Set sKey = h.keySet(); 

		// checking key set 
		System.out.println("key set: " + sKey); 
	} 
} 
