package setInterface;

import java.util.EnumSet;
import java.util.Set;

enum Countries { NEPAL, INDIA, UNITED_STATES_OF_AMERICA, CANADA, UK }
enum Color
{
    RED, GREEN, BLUE;
}

public class EnumSetImplementation {
	
	public static void main(String[] args)
    {
        // Creating a set
        Set<Countries> countriesSet;
 
        // Adding the elements
        countriesSet = EnumSet.of(Countries.NEPAL, Countries.INDIA,
        		Countries.UNITED_STATES_OF_AMERICA, Countries.CANADA,Countries.UK);
 
        System.out.println("Countries Set : " + countriesSet);
        
        Color arr[] = Color.values();
 
        for (Color col : arr)
        {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                             + col.ordinal());
        }
 
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
//         System.out.println(Color.valueOf("WHITE")); 
    }

}
