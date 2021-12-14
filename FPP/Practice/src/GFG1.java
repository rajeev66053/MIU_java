// Java program to remove elements 
// in a List 

import java.util.*; 

public class GFG1 { 

	public static void main(String args[]) 
	{ 
		List<String> al = new ArrayList<>(); 

		al.add("Geeks"); 
		al.add("Geeks"); 
		al.add(1, "For"); 

		System.out.println( 
			"Initial ArrayList " + al); 

		al.remove(1); 

		System.out.println( 
			"After the Index Removal " + al); 

		al.remove("Geeks"); 

		System.out.println( 
			"After the Object Removal " + al); 
	} 
} 
