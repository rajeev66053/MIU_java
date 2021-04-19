import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an array of String type
	    String[] arr = { "Java", "Python", "C++" };
	    System.out.print("Array: ");

	    // print array
	    for (String str : arr) {
	      System.out.print(str);
	      System.out.print(" ");
	    }

	    // create an ArrayList from an array
	    ArrayList<String> languages = new ArrayList<>(Arrays.asList(arr));
	    System.out.println("\nArrayList: " + languages);
	}

}
