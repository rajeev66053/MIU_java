// Java program to change elements 
// in a List 

import java.util.*; 

public class GFG { 

	public static void main(String args[]) 
	{ 
		List<String> al = new ArrayList<>(); 

		al.add("Geeks"); 
		al.add("Geeks"); 
		al.add(1, "Geeks");

		System.out.println("Initial ArrayList " + al); 

		al.set(1, "For"); 

		System.out.println("Updated ArrayList " + al); 
	} 
} 
