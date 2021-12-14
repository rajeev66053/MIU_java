package setInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImplementation {
	
	public static void main(String[] args)
    {
        // Demonstrating Set using HashSet
        // Declaring object of type String
        Set<String> hash_Set = new HashSet<String>();
 
        // Adding elements to the Set
        // using add() method
        hash_Set.add("Ewe");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");
        hash_Set.add(null);
 
        // Printing elements of HashSet object
        System.out.println(hash_Set);
        
     // Iterating through iterators
        Iterator<String> i = hash_Set.iterator();
 
        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext()) {
 
            System.out.println(i.next());
        }
        
        
        System.out.println("Contains " + hash_Set.contains("Ewe"));
        
        hash_Set.remove("Ewe");
 
        System.out.println("After removing element " + hash_Set);
        
     // Creating an object of Set class
        // Declaring object of Integer type
        Set<Integer> a = new HashSet<Integer>();
       
        // Adding all elements to List
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
        
        System.out.println("Set a "+ a);
       
      // Again declaring object of Set class
      // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();
         
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
      

      System.out.println("Set b "+ b);
 
         
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set a and b");
        System.out.println(union);
 
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set a and b");
        System.out.println(intersection);
 
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set a and b");
        System.out.println(difference);
    }

}
