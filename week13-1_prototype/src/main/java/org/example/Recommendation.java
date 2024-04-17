package org.example;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void addBook(Book book) {
        books.add(book.clone());
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books); // Return a copy of books list
    }

    // Clone method for Recommendation
    @Override
    public Recommendation clone() {
        try {
            Recommendation cloned = (Recommendation) super.clone();
            cloned.books = new ArrayList<>(this.books.size());
            for (Book book : this.books) {
                cloned.books.add(book.clone()); // Ensure deep copy
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can never happen
        }
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "targetAudience='" + targetAudience + '\'' +
                ", books=" + books +
                '}';
    }
}

