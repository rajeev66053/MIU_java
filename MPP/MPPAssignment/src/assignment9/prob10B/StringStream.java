package assignment9.prob10B;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stringStream=Stream.of("Bill","Thomas","Mary");
		
		System.out.println(stringStream.collect(Collectors.joining(", ")));

	}

}
