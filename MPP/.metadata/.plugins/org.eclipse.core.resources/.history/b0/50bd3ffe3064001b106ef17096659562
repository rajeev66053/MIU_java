package assignment9.prob9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);

	}
	
	public static void printSquares(int limit) {
		IntStream int1=IntStream.iterate(1, n->nextSquare(n)).limit(limit);
		int1.forEach(System.out::println);
	}
	
	public static int nextSquare(int n) {
		return (int) Math.pow((int)Math.sqrt(n) + 1, 2);
	}

}
