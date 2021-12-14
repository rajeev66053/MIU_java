import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      List<String> list = new ArrayList<>(Arrays.asList(a));
	      list.addAll(Arrays.asList(b));
	      System.out.println(list);

	}

}
