import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();

	    // add elements in the array list
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("C++");
	    System.out.println("ArrayList: " + languages);

	    // create a new array of String type
	    String[] arr = new String[languages.size()];

	    // convert ArrayList into an array
	    languages.toArray(arr);
	    System.out.print("Array: ");

	    // access elements of the array
	    for (String item : arr) {
	      System.out.print(item + ", ");
	    }
	}

}
