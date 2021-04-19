package assignment8.prob5A;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		list.stream()
		.map(word->word.toUpperCase())
		.forEach(word->System.out.println(word));
		
	}
	
	
}