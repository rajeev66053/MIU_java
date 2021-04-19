package assignment8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	/* As a lambda:
		(x,y) -> {
					List<Double> list = new ArrayList<>();
					list.add(Math.pow(x,y));
					list.add(x * y);
					return list;
				};

	 */
	public static void main(String[] args) {
//		class MyBiFunction implements BiFunction<Double, Double, List> {
//			public List apply(Double x, Double y) {
//				List<Double> list = new ArrayList<>();
//				list.add(Math.pow(x,y));
//				list.add(x * y);
//				return list;
//			}
//		}
//		MyBiFunction f = new MyBiFunction();
//		System.out.println(f.apply(2.0, 3.0));
		
		
		
		BiFunction<Double, Double, List<Double>> f =
				(x,y) -> { 
					List<Double> list = new ArrayList<>();
					list.add(Math.pow(x, y));
					list.add(x * y);
					return list;
				};
			System.out.println(f.apply(2.0, 3.0));
	}
}
