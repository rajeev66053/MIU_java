// Java code illustrating elements() method 
import java.util.*; 
class hashTableEnumeration { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
			new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		// create enumeration 
		Enumeration e = h.elements(); 

		System.out.println("display values:"); 

		while (e.hasMoreElements()) { 
			System.out.println(e.nextElement()); 
		} 
	} 
} 
