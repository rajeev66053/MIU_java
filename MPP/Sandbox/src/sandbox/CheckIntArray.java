package sandbox;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CheckIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(2,5,3,7,4);
		List<int[]> intArrys=list.stream().map(int[]::new).collect(Collectors.toList());
		
		List<String> intArrayStr=intArrys.stream().map(Arrays::toString).collect(Collectors.toList());
		
		System.out.println(intArrayStr);
		
		
		
		Predicate<String> predicate=s->s.startsWith("Q");
		
		List<String> words=Arrays.asList("apple","ball","Queen");
		Optional<String> startsWithQ= words.stream()
										.filter(predicate)
										.findFirst();
		
		if(startsWithQ.isPresent()) {
			System.out.println(startsWithQ.get());
		}
		

	}

}
