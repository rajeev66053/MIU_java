// Java code illustrating containsKey() method 
import java.util.*; 

class hashTableContainsKey { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<String, Integer> marks = new Hashtable<String, Integer>(); 

		// enter name/marks pair 
		marks.put("tweener", new Integer(345)); 
		marks.put("krantz", new Integer(100)); 
		marks.put("burrows", new Integer(790)); 
		marks.put("tancredi", new Integer(800)); 
		marks.put("bellick", new Integer(435)); 

		// check whether a value exists or not 
		if (marks.containsKey("burrows")) 
			System.out.println("Key found in table"); 
	} 
}
