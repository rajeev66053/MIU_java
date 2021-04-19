package assignment8.prob1B;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Supplier<Double> random=()->Math.random();
		System.out.println(random.get());
		
		Supplier<Double> mathRandom=new MathRandom();
		System.out.println(mathRandom.get());
	}

}
