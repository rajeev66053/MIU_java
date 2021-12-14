// Java code illustrating equal() method 
import java.util.*; 
class hashTableEquals { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<Integer, String> h = 
				new Hashtable<Integer, String>(); 

		Hashtable<Integer, String> h1 = 
				new Hashtable<Integer, String>(); 

		h.put(3, "Geeks"); 
		h.put(2, "forGeeks"); 
		h.put(1, "isBest"); 

		h1.put(3, "Geeks"); 
		h1.put(2, "forGeeks"); 
		h1.put(1, "isBest"); 

		// checking whether both hash tables 
		// are equal or not 
		if (h.equals(h1)) 
			System.out.println("both are equal"); 
	} 
}
