package org.example;
import java.util.Iterator;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FibonacciSequence sequence = new FibonacciSequence(10);
        Iterator<Integer> it = sequence.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
