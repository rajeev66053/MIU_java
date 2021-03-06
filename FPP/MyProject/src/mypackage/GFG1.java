// Java program to demonstrate 
// listIterator() method 
// for String value 
package mypackage;

import java.util.*; 

public class GFG1 { 
	public static void main(String[] argv) throws Exception 
	{ 
		try { 

			// Creating object of ArrayList<Integer> 
			ArrayList<String> 
				arrlist = new ArrayList<String>(); 

			// adding element to arrlist 
			arrlist.add("A"); 
			arrlist.add("B"); 
			arrlist.add("C"); 
			arrlist.add("D"); 

			// print arrlist 
			System.out.println("ArrayList: "
							+ arrlist); 

			// Creating object of ListIterator<String> 
			// using listIterator() method 
			ListIterator<String> 
				iterator = arrlist.listIterator(); 
          
			iterator.add("E");
			iterator.add("F");
			iterator.add("G");
          
          System.out.println(arrlist);

			// Printing the iterated value 
			System.out.println("\nUsing ListIterator:\n"); 
			
			System.out.println("\nUsing ListIterator next:\n");
			while (iterator.hasNext()) { 
				System.out.println("Value is : "
								+ iterator.next()); 
			} 

			System.out.println("\nUsing ListIterator previous:\n");
			while (iterator.hasPrevious()) { 
				System.out.println("Value is : "
								+ iterator.previous()); 
			} 
		} 

		catch (NullPointerException e) { 
			System.out.println("Exception thrown : " + e); 
		} 
	} 
} 