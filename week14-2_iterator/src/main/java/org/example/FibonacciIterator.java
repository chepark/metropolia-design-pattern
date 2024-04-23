package org.example;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer> {
    private int limit;
    private int count = 0;
    private int current = 1;
    private int previous = 0;

    public FibonacciIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return count < limit;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        int next = current + previous;
        previous = current;
        current = next;
        count++;
        return current;
    }
}
