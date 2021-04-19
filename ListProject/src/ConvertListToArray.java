import java.util.Arrays;
import java.util.LinkedList;

public class ConvertListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stuff= {"babies","watermelon","melons","fudge"};
		LinkedList<String> thelist =new LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("pumpking");
		thelist.addFirst("firstthing");
		
		
		//component back to array
		stuff=thelist.toArray(new String[thelist.size()]);
		
		for(String x:stuff) {
			System.out.printf("%s ", x);
		}

	}

}
