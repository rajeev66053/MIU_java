package ImplementingIterableIterator;

import java.util.Iterator;

public class FactorialIterable implements Iterable<Integer> {

    private final FactorialIterator factorialIterator;

    public FactorialIterable(Integer value) {
        factorialIterator = new FactorialIterator(value);
    }

    @Override
    public Iterator<Integer> iterator() {
        return factorialIterator;
    }

//    @Override
//    public void forEach(Consumer<? super Integer> action) {
//        Objects.requireNonNull(action);
//        Integer last = 0;
//        for (Integer t : this) {
//            last = t;
//        }
//        action.accept(last);
//    }

}