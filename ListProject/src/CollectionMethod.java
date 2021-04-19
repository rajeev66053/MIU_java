import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] crap= {"apples","lemons","geese","bacon","youtube"};
		List<String> li=Arrays.asList(crap);
		
		Collections.sort(li);
		System.out.printf("%s\n", li);
		

		Collections.sort(li,Collections.reverseOrder());
		System.out.printf("%s\n", li);

	}

}
