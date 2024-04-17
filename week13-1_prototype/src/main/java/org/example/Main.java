package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "Dystopian", 1949);
        Book book2 = new Book("Brave New World", "Aldous Huxley", "Dystopian", 1932);

        Recommendation recommendation1 = new Recommendation("Adults");
        recommendation1.addBook(book1);
        recommendation1.addBook(book2);

        Recommendation recommendation2 = recommendation1.clone();
        recommendation2.addTargetAudience("Young Adults");
        recommendation2.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));

        System.out.println("Original: " + recommendation1);
        System.out.println("Cloned: " + recommendation2);
    }
}
