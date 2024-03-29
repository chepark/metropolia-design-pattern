package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Initialize Access Control Service and Library
        AccessControlService acs = AccessControlService.getInstance();
        Library library = new Library();

        // Create Documents
        Document doc1 = new Document("1", "2023-01-01", "Document 1");
        Document doc2 = new Document("2", "2023-01-02", "Document 2");

        // Add documents to Library
        library.addDocument(doc1.getId(), doc1); // Unprotected
        library.addDocument(doc2.getId(), new ProxyDocument(doc2)); // Protected

        // Create Users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Grant Access
        acs.grantAccess("2", "Alice");

        try {
            System.out.println("User1 accessing doc1: " + library.getDocument("1").getContent(user1));
            System.out.println("User2 accessing doc1: " + library.getDocument("1").getContent(user2));
            System.out.println("User1 accessing doc2: " + library.getDocument("2").getContent(user1));
            System.out.println("User2 accessing doc2: " + library.getDocument("2").getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
