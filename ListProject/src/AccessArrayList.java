import java.util.ArrayList;

public class AccessArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>();

	    // add elements in the arraylist
	    animals.add("Cat");
	    animals.add("Dog");
	    animals.add("Cow");
	    System.out.println("ArrayList: " + animals);

	    // get the element from the arraylist
	    String str = animals.get(1);
	    System.out.print("Element at index 1: " + str);
	}

}
