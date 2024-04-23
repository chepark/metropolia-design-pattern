package org.example;
import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    private int limit; // controlling the length of sequence generation

    public FibonacciSequence(int limit) {
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(limit);
    }
}

