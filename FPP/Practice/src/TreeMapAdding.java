// Java program to demonstrate 
// the working of TreeMap 

import java.util.*; 
class TreeMapAdding{ 
	public static void main(String args[]) 
	{ 
		// Default Initialization of a 
		// TreeMap 
		TreeMap tm1 = new TreeMap(); 

		// Initialization of a TreeMap 
		// using Generics 
		TreeMap<Integer, String> tm2 
			= new TreeMap<Integer, String>(); 

		// Inserting the Elements 
		tm1.put(3, "Geeks"); 
		tm1.put(2, "For"); 
		tm1.put(1, "Geeks"); 

		tm2.put(new Integer(3), "Geeks"); 
		tm2.put(new Integer(2), "For"); 
		tm2.put(new Integer(1), "Geeks"); 

		System.out.println(tm1); 
		System.out.println(tm2); 
	} 
} 
