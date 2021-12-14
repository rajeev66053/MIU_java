package ImplementingIterableIterator;

import java.util.Iterator;

public class FctorialExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialIterable fi = new FactorialIterable(10);
		Iterator<Integer> iterator = fi.iterator();
		while (iterator.hasNext()){
		     System.out.println(iterator.next());
		}

	}

}
