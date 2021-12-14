// Java code illustrating containsValue() method 
import java.util.*; 
class hashTableContainsValue { 
	public static void main(String[] arg) 
	{ 
		// creating a hash table 
		Hashtable<String, Integer>marks = 
				new Hashtable<String, Integer>(); 

		// enter name/marks pair 
		marks.put("tweener", new Integer(345)); 
		marks.put("krantz", new Integer(245)); 
		marks.put("burrows", new Integer(790)); 
		marks.put("tancredi", new Integer(365)); 
		marks.put("bellick", new Integer(435)); 

		// check whether a value exists or not 
		if (marks.containsValue(345)) 
			System.out.println("value found in table"); 
	} 
}
