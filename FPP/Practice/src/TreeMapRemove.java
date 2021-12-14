// Java program to demonstrate 
// the working of TreeMap 

import java.util.*; 
class TreeMapRemove{ 
	public static void main(String args[]) 
	{ 
		// Initialization of a TreeMap 
		// using Generics 
		TreeMap<Integer, String> tm 
			= new TreeMap<Integer, String>(); 

		// Inserting the Elements 
		tm.put(3, "Geeks"); 
		tm.put(2, "Geeks"); 
		tm.put(1, "Geeks"); 
		tm.put(4, "For"); 

		System.out.println(tm); 

		tm.remove(4); 

		System.out.println(tm); 
	} 
} 
