package assignment11.prob1;

import java.util.ArrayList;
import java.util.List;

public class Prob1a {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums = ints; // Compiler error in this line because Covariance not supported in Java Generics
		//nums.add(3.14);
	}

}
