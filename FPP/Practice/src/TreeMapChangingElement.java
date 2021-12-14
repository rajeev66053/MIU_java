// Java program to demonstrate 
// the working of TreeMap 

import java.util.*; 
class TreeMapChangingElement{ 
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

		System.out.println(tm); 

		tm.put(2, "For"); 

		System.out.println(tm); 
	} 
} 
