import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		l.forEach(System.out::println);
		
	}

}
